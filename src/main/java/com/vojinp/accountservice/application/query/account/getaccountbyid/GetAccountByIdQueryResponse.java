package com.vojinp.accountservice.application.query.account.getaccountbyid;

import com.vojinp.accountservice.application.query.QueryResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetAccountByIdQueryResponse extends QueryResponse {
    private String account;
}
