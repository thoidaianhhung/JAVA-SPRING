package com.vti.Assignment1.repository;

import com.vti.Assignment1.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
