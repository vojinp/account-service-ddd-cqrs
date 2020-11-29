package com.vojinp.accountservice.command.account.createaccount;

import com.vojinp.accountservice.command.CommandExecutor;
import org.springframework.stereotype.Service;

@Service
public class CreateAccountCommandExecutor
        implements CommandExecutor<CreateAccountCommand, CreateAccountCommandResponse> {

    @Override
    public CreateAccountCommandResponse execute(CreateAccountCommand command) {
        return new CreateAccountCommandResponse(1L);
    }
}
