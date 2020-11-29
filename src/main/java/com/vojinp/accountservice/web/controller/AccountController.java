package com.vojinp.accountservice.web.controller;

import com.vojinp.accountservice.command.CommandDispatcher;
import com.vojinp.accountservice.query.QueryDispatcher;
import com.vojinp.accountservice.query.account.getaccountbyid.GetAccountByIdQuery;
import com.vojinp.accountservice.query.account.getaccountbyid.GetAccountByIdQueryResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class AccountController {
    private final CommandDispatcher commandDispatcher;
    private final QueryDispatcher queryDispatcher;

    @GetMapping("")
    public String example() {
        return ((GetAccountByIdQueryResponse) queryDispatcher.dispatch(new GetAccountByIdQuery()))
                .getAccount();
    }
}
