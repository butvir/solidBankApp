package kz.singularity.bolatov.solidbankapp.service.impl;

import kz.singularity.bolatov.solidbankapp.DAO.AccountDao;
import kz.singularity.bolatov.solidbankapp.model.AccountType;
import kz.singularity.bolatov.solidbankapp.model.CheckingAccount;
import kz.singularity.bolatov.solidbankapp.model.FixedAccount;
import kz.singularity.bolatov.solidbankapp.model.SavingAccount;
import kz.singularity.bolatov.solidbankapp.service.AccountCreationService;

public class AccountCreationServiceImpl implements AccountCreationService {
    AccountDao accountDao;
    public AccountCreationServiceImpl(AccountDao accountDao){
        this.accountDao = accountDao;
    }
    @Override
    public void  create(AccountType accountType, long bankId, String clientId, String accountId) {
        switch (accountType){
            case CHECKING -> accountDao.createNewAccount(new CheckingAccount(accountType, accountId, clientId, 0.0, true));
            case SAVING -> accountDao.createNewAccount(new SavingAccount(accountType, accountId, clientId, 0.0, true));
            case FIXED -> accountDao.createNewAccount(new FixedAccount(accountType, accountId, clientId, 0.0, false));
            default -> System.out.println("Wrong input");
        }

    }
}
