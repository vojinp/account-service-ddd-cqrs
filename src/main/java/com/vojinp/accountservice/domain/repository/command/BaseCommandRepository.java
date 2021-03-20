package com.vojinp.accountservice.domain.repository.command;


import com.vojinp.accountservice.domain.aggregates.AggregateRootEntity;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;

@NoRepositoryBean

public interface BaseCommandRepository<T extends AggregateRootEntity, ID extends Serializable> extends Repository<T, ID>{
    T save(T persisted);

    void delete(T entity);
}
