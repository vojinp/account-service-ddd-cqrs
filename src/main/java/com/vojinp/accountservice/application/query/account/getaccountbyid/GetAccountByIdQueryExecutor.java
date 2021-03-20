package com.vojinp.accountservice.application.query.account.getaccountbyid;

import com.vojinp.accountservice.application.query.QueryExecutor;
import org.springframework.stereotype.Service;

@Service
public class GetAccountByIdQueryExecutor
        implements QueryExecutor<GetAccountByIdQuery, GetAccountByIdQueryResponse> {

    @Override
    public GetAccountByIdQueryResponse execute(GetAccountByIdQuery command) {
        return new GetAccountByIdQueryResponse("account");
    }
}
