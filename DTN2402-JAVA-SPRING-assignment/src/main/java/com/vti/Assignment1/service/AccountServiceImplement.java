package com.vti.Assignment1.service;

import com.vti.Assignment1.dto.AccountDto;
import com.vti.Assignment1.entity.Account;
import com.vti.Assignment1.form.AccountCreateForm;
import com.vti.Assignment1.form.AccountUpdateForm;
import com.vti.Assignment1.mapper.AccountMapper;
import com.vti.Assignment1.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AccountServiceImplement implements IAccountService{
    private AccountRepository repository;
    @Override
    public List<AccountDto> findAll() {
        var accounts = repository.findAll();
        var dtos = new ArrayList<AccountDto>();
        for (Account account : accounts) {
            var dto = AccountMapper.map(account);
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public AccountDto findById(Integer id) {
        return repository.findById(id)
                .map(AccountMapper::map)
                .orElse(null);
    }

    @Override
    public AccountDto create(AccountCreateForm form) {
        var account = AccountMapper.map(form);
        var savedAccount = repository.save(account);
        return AccountMapper.map(savedAccount);
    }

    @Override
    public AccountDto update(Integer id, AccountUpdateForm form) {
        var optional = repository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }
        var account = optional.get();
        AccountMapper.map(form, account);
        var savedAccount = repository.save(account);
        return AccountMapper.map(savedAccount);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
