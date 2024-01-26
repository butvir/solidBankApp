package kz.singularity.bolatov.solidbankapp.model;

import kz.singularity.bolatov.solidbankapp.service.AccountListingService;
import kz.singularity.bolatov.solidbankapp.service.BankCore;

public class AccountBasicCLI {
    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListing;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListing) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }

    public void  createAccountRequest(String clientId){

    }
    public void getAccounts(String clientId){

    }
}
