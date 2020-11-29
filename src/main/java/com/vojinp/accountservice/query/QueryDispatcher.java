package com.vojinp.accountservice.query;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class QueryDispatcher {
    private final Map<String, QueryExecutor> rawMap;
    private final Map<Class, QueryExecutor> preparedMap = new HashMap<>();

    public QueryDispatcher(Map<String, QueryExecutor> rawMap) {
        this.rawMap = rawMap;
    }

    @PostConstruct
    private void setUp() {
        if (rawMap != null && !rawMap.isEmpty()) {
            for (QueryExecutor commandExecutor : rawMap.values()) {
                Type command =
                        ((ParameterizedType) commandExecutor.getClass().getGenericInterfaces()[0])
                                .getActualTypeArguments()[0];
                preparedMap.put((Class) command, commandExecutor);
            }
        }
    }

    public <C extends Query, R extends QueryResponse> R dispatch(C command) {
        return (R) preparedMap.get(command.getClass()).execute(command);
    }
}
