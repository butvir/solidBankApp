package kz.singularity.bolatov.solidbankapp.model;

import kz.singularity.bolatov.solidbankapp.service.AccountListingService;
import kz.singularity.bolatov.solidbankapp.service.BankCore;

public class AccountBasicCLI {
    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListingService;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListingService) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListingService = accountListingService;
    }

    public void  createAccountRequest(AccountType accountType, String clientId){
        bankCore.createNewAccount(accountType, clientId);
    }
    public void getAccounts(String clientId){
        System.out.println(accountListingService.getClientAccounts(clientId));
    }
}
