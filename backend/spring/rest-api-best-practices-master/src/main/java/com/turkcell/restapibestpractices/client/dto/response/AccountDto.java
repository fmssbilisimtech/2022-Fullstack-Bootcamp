package com.turkcell.restapibestpractices.client.dto.response;



import com.turkcell.restapibestpractices.model.enums.Currency;
import lombok.*;



@Getter
@Setter
@Builder
public class AccountDto {


    private long id;

    private Long customerId;
    private Double balance;
    private Currency currency;
}