package com.turkcell.restapibestpractices.model;


import com.turkcell.restapibestpractices.model.enums.City;
import com.turkcell.restapibestpractices.model.enums.Currency;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    private Double balance;

    @Enumerated
    private City city;

    @Enumerated
    private Currency currency;

}