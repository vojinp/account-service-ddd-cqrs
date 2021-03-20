package com.vojinp.accountservice.application.command;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class CommandDispatcher {
    private final Map<String, CommandExecutor> rawMap;
    private final Map<Class, CommandExecutor> preparedMap = new HashMap<>();

    public CommandDispatcher(Map<String, CommandExecutor> rawMap) {
        this.rawMap = rawMap;
    }

    @PostConstruct
    private void setUp() {
        if (rawMap != null && !rawMap.isEmpty()) {
            for (CommandExecutor commandExecutor : rawMap.values()) {
                Type command =
                        ((ParameterizedType) commandExecutor.getClass().getGenericInterfaces()[0])
                                .getActualTypeArguments()[0];
                preparedMap.put((Class) command, commandExecutor);
            }
        }
    }

    public <C extends Command, R extends CommandResponse> R dispatch(C command) {
        return (R) preparedMap.get(command.getClass()).execute(command);
    }
}
