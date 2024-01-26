package kz.singularity.bolatov.solidbankapp.service;

import kz.singularity.bolatov.solidbankapp.model.AccountType;
import kz.singularity.bolatov.solidbankapp.model.CLIUI;

import java.util.Scanner;

public class MyCLI implements CLIUI {

    private Scanner scanner;

    MyCLI(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    public double requestClientAmount(){
        return 0;
    }

    public String requestClientAccountNumber(){
        return "";
    }

    @Override
    public AccountType requestAccountType() {
        return null;
    }
}
