package com.vojinp.accountservice.domain.aggregates.account;

import com.vojinp.accountservice.domain.aggregates.AggregateRootEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "account")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Account extends AggregateRootEntity {

    @Column(name = "account_number")
    private String accountNumber;
}
