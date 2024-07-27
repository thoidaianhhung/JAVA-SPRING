package com.vti.assignment.mapper;

import com.vti.assignment.dto.AccountDto;
import com.vti.assignment.entity.Account;
import com.vti.assignment.form.AccountCreateForm;
import com.vti.assignment.form.AccountUpdateForm;

public class AccountMapper {
    public static Account map(AccountCreateForm form) {
        var account = new Account();
        account.setEmail(form.getEmail());
        account.setUserName(form.getUserName());
        account.setFullName(form.getFullName());
        return account;
    }

    public static AccountDto map(Account account) {
        var accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setEmail(account.getEmail());
        accountDto.setUserName(account.getUserName());
        accountDto.setFullName(account.getFullName());
        accountDto.setDepartmentId(account.getDepartmentId());
        accountDto.setPositionId(account.getPositionId());
        accountDto.setCreatedDate(account.getCreatedDate());
        return accountDto;
    }

    public static void map(AccountUpdateForm form, Account account) {
        account.setEmail(form.getEmail());
        account.setUserName(form.getUserName());
        account.setFullName(form.getFullName());
    }
}
