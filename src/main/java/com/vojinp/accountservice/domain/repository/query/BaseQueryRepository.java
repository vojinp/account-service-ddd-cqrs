package com.vojinp.accountservice.domain.repository.query;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseQueryRepository<T, ID extends Serializable> extends Repository<T, ID> {

    List<T> findAll();

    Optional<T> findById(ID id);

    Page<T> findAll(Pageable pageable);
}
