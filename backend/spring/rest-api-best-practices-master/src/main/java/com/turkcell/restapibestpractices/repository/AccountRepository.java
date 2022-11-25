package com.turkcell.restapibestpractices.repository;

import com.turkcell.restapibestpractices.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Long> {


}
