package com.turkcell.restapibestpractices.model;

import com.turkcell.restapibestpractices.model.enums.City;
import lombok.*;



import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDate;

    @Enumerated
    private City city;

    private String email;

}