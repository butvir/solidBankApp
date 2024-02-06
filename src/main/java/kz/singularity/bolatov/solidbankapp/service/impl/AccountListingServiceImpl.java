package kz.singularity.bolatov.solidbankapp.service.impl;

import kz.singularity.bolatov.solidbankapp.DAO.AccountDao;
import kz.singularity.bolatov.solidbankapp.model.Account;
import kz.singularity.bolatov.solidbankapp.model.AccountType;
import kz.singularity.bolatov.solidbankapp.model.AccountWithdraw;
import kz.singularity.bolatov.solidbankapp.service.AccountListingService;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {
    AccountDao accountDao;

    public AccountListingServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public Account getClientAccount(String clientId, String accountId) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientId, String accountId) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientId) {
        return accountDao.getClientAccounts(clientId);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientId, AccountType accountType) {
        return null;
    }
}
