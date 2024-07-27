package com.vti.assignment.service;

import com.vti.assignment.dto.AccountDto;
import com.vti.assignment.form.AccountCreateForm;
import com.vti.assignment.form.AccountUpdateForm;

import java.util.List;

public interface AccountService {
    List<AccountDto> findAll();

    AccountDto findById(Integer id);

    AccountDto create(AccountCreateForm form);

    AccountDto update(Integer id, AccountUpdateForm form);

    void deleteById(Integer id);
}
