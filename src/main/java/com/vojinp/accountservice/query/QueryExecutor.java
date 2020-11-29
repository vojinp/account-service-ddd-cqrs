package com.vojinp.accountservice.query;

public interface QueryExecutor<C extends Query, R extends QueryResponse> {
    R execute(C command);
}
