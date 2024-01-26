package kz.singularity.bolatov.solidbankapp.service;

import kz.singularity.bolatov.solidbankapp.model.AccountType;

public interface AccountCreationService {
    void create(AccountType accountType, long bankId, String clientId, long accountId);
}
