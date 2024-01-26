package kz.singularity.bolatov.solidbankapp.service;

import kz.singularity.bolatov.solidbankapp.model.Account;
import kz.singularity.bolatov.solidbankapp.model.AccountType;
import kz.singularity.bolatov.solidbankapp.model.AccountWithdraw;

import java.util.List;

public interface AccountListingService {
    Account getClientAccount(String clientId, String accountId);
    AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);
    List<Account> getClientAccounts(String clientId);
    List<Account> getClientAccountsByType(String clientId, AccountType accountType);
}
