package com.vojinp.accountservice.application.query.account.getaccounts;

import com.vojinp.accountservice.application.query.QueryExecutor;
import com.vojinp.accountservice.application.query.account.getaccountbyid.GetAccountByIdQueryResponse;
import com.vojinp.accountservice.domain.aggregates.account.Account;
import com.vojinp.accountservice.domain.repository.query.AccountQueryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetAccountsQueryExecutor
        implements QueryExecutor<GetAccountsQuery, GetAccountsQueryResponse> {

    private final AccountQueryRepository accountQueryRepository;

    @Override
    public GetAccountsQueryResponse execute(GetAccountsQuery command) {
        Page<Account> accounts = accountQueryRepository.findAll(PageRequest.of(0, 10));

        return new GetAccountsQueryResponse(accounts);
    }
}
