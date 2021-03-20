package com.vojinp.accountservice.web.controller;

import com.vojinp.accountservice.application.command.CommandDispatcher;
import com.vojinp.accountservice.application.command.account.createaccount.CreateAccountCommand;
import com.vojinp.accountservice.application.command.account.createaccount.CreateAccountCommandResponse;
import com.vojinp.accountservice.application.query.QueryDispatcher;
import com.vojinp.accountservice.application.query.account.getaccountbyid.GetAccountByIdQuery;
import com.vojinp.accountservice.application.query.account.getaccountbyid.GetAccountByIdQueryResponse;
import com.vojinp.accountservice.application.query.account.getaccounts.GetAccountsQuery;
import com.vojinp.accountservice.application.query.account.getaccounts.GetAccountsQueryResponse;
import com.vojinp.accountservice.domain.aggregates.account.Account;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@AllArgsConstructor
@RestController
@RequestMapping("accounts")
public class AccountController {
    private final CommandDispatcher commandDispatcher;
    private final QueryDispatcher queryDispatcher;

    @GetMapping("")
    public Page<Account> getAccount() {
        return ((GetAccountsQueryResponse) queryDispatcher.dispatch(new GetAccountsQuery())).getAccounts();
    }

    @PostMapping("")
    public ResponseEntity<Void> createAccount(@RequestBody  CreateAccountCommand createAccountCommand) throws URISyntaxException {
         CreateAccountCommandResponse createAccountCommandResponse = commandDispatcher.dispatch(createAccountCommand);

         return ResponseEntity.created(new URI("/accounts/" + createAccountCommandResponse.getId())).build();
    }
}
