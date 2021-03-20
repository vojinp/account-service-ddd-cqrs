package com.vojinp.accountservice.application.command.account.createaccount;

import com.vojinp.accountservice.application.command.CommandResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateAccountCommandResponse extends CommandResponse {
    Long id;
}
