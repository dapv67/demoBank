package com.CBSDemoBank.demoBank.web.controller;

import com.CBSDemoBank.demoBank.entity.AccountEntity;
import com.CBSDemoBank.demoBank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/getAll")
    public ResponseEntity<List<AccountEntity>> getAll(){
        return new ResponseEntity<>(accountService.getAll(), HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<AccountEntity> save(@RequestBody AccountEntity account){
        return new ResponseEntity<>(accountService.save(account),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<AccountEntity> updateUser(@PathVariable Long id, @RequestBody AccountEntity account) {
        AccountEntity updatedUser = accountService.updateAccount(id, account);
        if (updatedUser == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }


}
