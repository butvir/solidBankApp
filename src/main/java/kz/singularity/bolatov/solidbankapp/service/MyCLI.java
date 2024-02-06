package kz.singularity.bolatov.solidbankapp.service;

import kz.singularity.bolatov.solidbankapp.model.AccountType;
import kz.singularity.bolatov.solidbankapp.model.CLIUI;

import java.util.Scanner;

public class MyCLI implements CLIUI {

    private Scanner scanner;

    MyCLI() {
        this.scanner = new Scanner(System.in);
    }

    public double requestClientAmount(){
        return 0;
    }

    public String requestClientAccountNumber(){
        return "";
    }

    public Scanner getScanner(){
        return scanner;
    }
    @Override
    public AccountType requestAccountType() {
        return AccountType.valueOf(scanner.nextLine());
    }
}
