package com.vojinp.accountservice.command.account.createaccount;

import com.vojinp.accountservice.command.CommandResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateAccountCommandResponse extends CommandResponse {
    Long id;
}
