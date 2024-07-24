package com.vti.Assignment1.service;

import com.vti.Assignment1.dto.AccountDto;
import com.vti.Assignment1.form.AccountCreateForm;
import com.vti.Assignment1.form.AccountUpdateForm;

import java.util.List;

public interface IAccountService {
    List<AccountDto> findAll();

    AccountDto findById(Integer id);

    AccountDto create(AccountCreateForm form);

    AccountDto update(Integer id, AccountUpdateForm form);

    void deleteById(Integer id);
}
