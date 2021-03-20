package com.vojinp.accountservice.application.query;

public interface QueryExecutor<C extends Query, R extends QueryResponse> {
    R execute(C command);
}
