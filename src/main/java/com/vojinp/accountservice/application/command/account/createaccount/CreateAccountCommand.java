package com.vojinp.accountservice.application.command.account.createaccount;

import com.vojinp.accountservice.application.command.Command;
import com.vojinp.accountservice.domain.aggregates.account.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccountCommand extends Command<CreateAccountCommandResponse> {
    private Account account;
}
