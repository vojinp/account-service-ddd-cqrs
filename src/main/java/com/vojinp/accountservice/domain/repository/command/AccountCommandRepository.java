package com.vojinp.accountservice.domain.repository.command;

import com.vojinp.accountservice.domain.aggregates.account.Account;

public interface AccountCommandRepository extends BaseCommandRepository<Account, Long> {
}
