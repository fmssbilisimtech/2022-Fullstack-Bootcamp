package com.turkcell.restapibestpractices.service;


import com.turkcell.restapibestpractices.client.dto.response.AccountDto;
import com.turkcell.restapibestpractices.client.dto.request.CreateAccountRequest;
import com.turkcell.restapibestpractices.client.dto.request.UpdateAccountRequest;
import com.turkcell.restapibestpractices.exception.AccountNotFoundException;
import com.turkcell.restapibestpractices.exception.CustomerNotFoundException;
import com.turkcell.restapibestpractices.mapper.AccountMapper;
import com.turkcell.restapibestpractices.model.Account;
import com.turkcell.restapibestpractices.model.Customer;
import com.turkcell.restapibestpractices.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Slf4j
@Service
public class AccountService {

    private final AccountRepository accountRepository;

    private final CustomerService customerService;

    private final AccountMapper accountMapper;


    public AccountDto createAccount(CreateAccountRequest createAccountRequest) {
        Customer customer = customerService.getCustomerById(createAccountRequest.getCustomerId());

        if (customer.getId() == null) {
            throw new CustomerNotFoundException("Customer Not Found!");
        }

        Account account = accountMapper.toAccountFromCreateAccountRequest(createAccountRequest);

        return accountMapper.toAccountDto(accountRepository.save(account));
    }


    public AccountDto updateAccount(long id, UpdateAccountRequest request) {
        Customer customer = customerService.getCustomerById(request.getCustomerId());

        Optional<Account> accountOptional = accountRepository.findById(id);
        accountOptional.ifPresent(account -> {
            account.setBalance(request.getBalance());
            account.setCity(request.getCity());
            account.setCurrency(request.getCurrency());
            account.setCustomerId(request.getCustomerId());
            accountRepository.save(account);
        });

        return accountOptional.map(accountMapper::toAccountDto)
                .orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }


    public List<AccountDto> getAllAccountsDto() {
        List<Account> accountList = accountRepository.findAll();

        return accountList.stream().map(accountMapper::toAccountDto)
                .collect(Collectors.toList());
    }

    public AccountDto getAccountById(Long id) {
        return accountRepository.findById(id)
                .map(accountMapper::toAccountDto)
                . orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }


    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    public AccountDto withdrawMoney(Long id, Double amount) {
        Optional<Account> accountOptional = accountRepository.findById(id);
        accountOptional.ifPresent(account -> {
            if (account.getBalance() > amount) {
                account.setBalance(account.getBalance() - amount);
                accountRepository.save(account);
            } else {
                System.out.println("Insufficient funds -> accountId: " + id + " balance: " + account.getBalance() + " amount: " + amount);
            }
        });

        return accountOptional.map(accountMapper::toAccountDto)
                . orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }


    public AccountDto addMoney(Long id, Double amount) {
        Optional<Account> accountOptional = accountRepository.findById(id);

        accountOptional.ifPresent(account -> {
            account.setBalance(account.getBalance() + amount);
            accountRepository.save(account);
        });

        return accountOptional.map(accountMapper::toAccountDto)
                . orElseThrow(() -> new AccountNotFoundException("Account not found"));
    }



}