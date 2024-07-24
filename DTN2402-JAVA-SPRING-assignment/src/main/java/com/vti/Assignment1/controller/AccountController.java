package com.vti.Assignment1.controller;

import com.vti.Assignment1.dto.AccountDto;
import com.vti.Assignment1.form.AccountCreateForm;
import com.vti.Assignment1.form.AccountUpdateForm;
import com.vti.Assignment1.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController {
    private IAccountService service;

    @GetMapping("/api/v1/accounts")
    public List<AccountDto> findAll(){
        return service.findAll();
    }

    @GetMapping("/api/v1/accounts/{id}")
    public AccountDto findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    @PostMapping("/api/v1/accounts")
    public AccountDto create(@RequestBody AccountCreateForm form) {
        return service.create(form);
    }

    @PutMapping("/api/v1/accounts/{id}")
    public AccountDto update(@PathVariable Integer id, @RequestBody AccountUpdateForm form) {
        return service.update(id, form);
    }

    @DeleteMapping("/api/v1/accounts/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
