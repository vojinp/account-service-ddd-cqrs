package com.vojinp.accountservice.application.query.account.getaccounts;

import com.vojinp.accountservice.application.query.QueryResponse;
import com.vojinp.accountservice.domain.aggregates.account.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.domain.Page;

@Getter
@AllArgsConstructor
public class GetAccountsQueryResponse extends QueryResponse {
    private Page<Account> accounts;
}
