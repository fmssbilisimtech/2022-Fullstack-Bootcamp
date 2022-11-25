package com.turkcell.restapibestpractices.mapper;


import com.turkcell.restapibestpractices.client.dto.response.AccountDto;
import com.turkcell.restapibestpractices.client.dto.request.CreateAccountRequest;
import com.turkcell.restapibestpractices.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(implementationName = "AccountMapperImpl" , componentModel = "spring")
public interface AccountMapper {

    Account toAccount(AccountDto accountDto);

    AccountDto toAccountDto(Account account);



    @Mapping(target = "customerId" , source = "customerId")
    Account toAccountFromCreateAccountRequest(CreateAccountRequest createAccountRequest);

}
