package com.vti.Assignment1.mapper;

import com.vti.Assignment1.dto.AccountDto;
import com.vti.Assignment1.entity.Account;
import com.vti.Assignment1.form.AccountCreateForm;
import com.vti.Assignment1.form.AccountUpdateForm;

public class AccountMapper {
    public static Account map(AccountCreateForm form) {
        var account = new Account();
        account.setEmail(form.getEmail());
        account.setUserName(form.getUserName());
        account.setFullName(form.getFullName());
        account.setDepartmentId(form.getDepartmentId());
        account.setPositionId(form.getPositionId());
        return account;
    }

    public static AccountDto map(Account account) {
        var accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setEmail(account.getEmail());
        accountDto.setUserName(account.getUserName());
        accountDto.setFullName(account.getFullName());
        accountDto.setDepartmentId(accountDto.getDepartmentId());
        accountDto.setPositionId(accountDto.getPositionId());
        accountDto.setCreatedDate(account.getCreatedDate());
        return accountDto;
    }

    public static void map(AccountUpdateForm form, Account account) {
        account.setEmail(form.getEmail());
        account.setUserName(form.getUserName());
        account.setFullName(form.getFullName());
        account.setDepartmentId(form.getDepartmentId());
        account.setPositionId(form.getPositionId());
    }
}
