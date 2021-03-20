package com.vojinp.accountservice.application.command;

public interface CommandExecutor<C extends Command, R extends CommandResponse> {
    R execute(C command);
}
