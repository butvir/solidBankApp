package kz.singularity.bolatov.solidbankapp.service;

import kz.singularity.bolatov.solidbankapp.model.AccountType;

public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;
    AccountCreationService accountCreation;

    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation;
    }

    public void createNewAccount(AccountType accountType, String clientId){
        accountCreation.create(accountType, id, clientId, String.valueOf(lastAccountNumber));
        this.incrementLastAccountNumber();
    }

    void incrementLastAccountNumber(){
        lastAccountNumber++;
    }

}
