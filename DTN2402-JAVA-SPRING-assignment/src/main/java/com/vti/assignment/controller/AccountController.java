package com.vti.assignment.controller;

import com.vti.assignment.dto.AccountDto;
import com.vti.assignment.form.AccountCreateForm;
import com.vti.assignment.form.AccountUpdateForm;
import com.vti.assignment.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController {
    private AccountService service;

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
