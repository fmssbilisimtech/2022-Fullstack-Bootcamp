package com.turkcell.restapibestpractices.client.dto.response.base;


import com.turkcell.restapibestpractices.model.enums.City;
import com.turkcell.restapibestpractices.model.enums.Currency;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString
public class BaseAccountRequest {

    @NotNull(message = "Customer id must not be null")
    private Long customerId;

    @NotNull
    @Min(value = 0, message = "Balance should not be less than 0")
    private Double balance;

    @NotNull(message = "Currency must not be null")
    private Currency currency;

    @NotNull(message = "City must not be null")
    private City city;
}
