package com.vojinp.accountservice.application.command;

import com.vojinp.accountservice.application.command.account.createaccount.CreateAccountCommand;
import com.vojinp.accountservice.application.command.account.createaccount.CreateAccountCommandExecutor;
import com.vojinp.accountservice.application.command.account.createaccount.CreateAccountCommandResponse;
import com.vojinp.accountservice.domain.aggregates.account.Account;
import com.vojinp.accountservice.domain.repository.command.AccountCommandRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CreateAccountCommandExecutorTests {

    private CreateAccountCommandExecutor executor;
    private AccountCommandRepository writeRepository;
    private Account testAccount;

    @BeforeEach
    public void setUp() {
        writeRepository = mock(AccountCommandRepository.class);
        executor = new CreateAccountCommandExecutor(writeRepository);
        testAccount = mock(Account.class);
        when(testAccount.getAccountNumber()).thenReturn("testAccountNumber");
        when(testAccount.getId()).thenReturn(1L);
    }

    @Test
    public void executeTest() {
        when(writeRepository.save(testAccount)).thenReturn(testAccount);

        CreateAccountCommandResponse response = executor.execute(new CreateAccountCommand(testAccount));

        Assertions.assertEquals(response.getId(), 1L);
    }
}
