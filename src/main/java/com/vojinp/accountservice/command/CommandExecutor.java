package com.vojinp.accountservice.command;

public interface CommandExecutor<C extends Command, R extends CommandResponse> {
    R execute(C command);
}
