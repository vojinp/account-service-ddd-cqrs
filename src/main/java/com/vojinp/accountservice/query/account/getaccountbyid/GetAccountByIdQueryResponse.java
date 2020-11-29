package com.vojinp.accountservice.query.account.getaccountbyid;

import com.vojinp.accountservice.query.QueryResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetAccountByIdQueryResponse extends QueryResponse {
    private String account;
}
