package kz.singularity.bolatov.solidbankapp.model;

public class FixedAccount extends AccountDeposit{
    public FixedAccount(AccountType accountType, String id, String clientId, double balance, boolean withdrawAllowed){
        super(accountType, id, clientId, balance, withdrawAllowed);
    }
}
