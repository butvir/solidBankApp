package kz.singularity.bolatov.solidbankapp;

import kz.singularity.bolatov.solidbankapp.model.Account;
import kz.singularity.bolatov.solidbankapp.model.AccountType;
import kz.singularity.bolatov.solidbankapp.model.AccountWithdraw;

import java.util.List;

public interface AccountDao {
    List<Account> getClientAccounts(String clientId);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account> getClientAccountsByType(String clientId, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientId, String accountId);
    Account getClientAccount(String clientId, String accountId);
}
