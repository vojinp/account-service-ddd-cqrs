package com.vojinp.accountservice.domain.aggregates;

import lombok.Getter;

import javax.persistence.*;

@MappedSuperclass
@Getter
public abstract class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;
}
