package com.CBSDemoBank.demoBank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@NoArgsConstructor
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_account")
    private Long idAccount;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_branch")
    private String bankBranch;

    @Column(name = "account_holder_name")
    private String accountHolderName;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "account_holder_email_id")
    private String accountHolderEmailId;
    /*public AccountEntity(){

    }
    public AccountEntity(String bankName, String bankBranch,String accountHolderName, String accountNumber, String mobileNumber, String accountHolderEmailId){
        this.bankName = bankName;
        this.bankBranch = bankBranch;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.mobileNumber = mobileNumber;
        this.accountHolderEmailId = accountHolderEmailId;
    }
    public String getBankName(){
        return bankBranch;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }


    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAccountHolderEmailId() {
        return accountHolderEmailId;
    }

    public void setAccountHolderEmailId(String accountHolderId) {
        this.accountHolderEmailId = accountHolderId;
    }
    */

}
