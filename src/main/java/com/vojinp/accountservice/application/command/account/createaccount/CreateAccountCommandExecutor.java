package com.vojinp.accountservice.application.command.account.createaccount;

import com.vojinp.accountservice.application.command.CommandExecutor;
import com.vojinp.accountservice.domain.aggregates.account.Account;
import com.vojinp.accountservice.domain.repository.command.AccountCommandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateAccountCommandExecutor
        implements CommandExecutor<CreateAccountCommand, CreateAccountCommandResponse> {

    private final AccountCommandRepository writeRepository;

    @Override
    public CreateAccountCommandResponse execute(CreateAccountCommand command) {

        Account account = writeRepository.save(command.getAccount());

        return new CreateAccountCommandResponse(account.getId());
    }
}
