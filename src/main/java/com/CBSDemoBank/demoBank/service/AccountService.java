package com.CBSDemoBank.demoBank.service;

import com.CBSDemoBank.demoBank.entity.AccountEntity;
import com.CBSDemoBank.demoBank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    @Autowired
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public AccountEntity save(AccountEntity account){
        return accountRepository.save(account);
    }

    public List<AccountEntity> getAll(){
        return  accountRepository.findAll();
    }
    public AccountEntity updateAccount(Long id, AccountEntity updatedAccount) {
        Optional<AccountEntity> existingAccountOptional = accountRepository.findById(id);
        if (existingAccountOptional.isPresent()) {
            AccountEntity existingAccount = existingAccountOptional.get();
            // set each field
            existingAccount.setBankName(updatedAccount.getBankName());
            existingAccount.setBankBranch(updatedAccount.getBankBranch());
            existingAccount.setAccountHolderName(updatedAccount.getAccountHolderName());
            existingAccount.setAccountNumber(updatedAccount.getAccountNumber());
            existingAccount.setMobileNumber(updatedAccount.getMobileNumber());
            existingAccount.setAccountHolderEmailId(updatedAccount.getAccountHolderEmailId());
            // save and return the user
            return accountRepository.save(existingAccount);
        } else {
            return null; // or throws an exception
        }
    }

}
