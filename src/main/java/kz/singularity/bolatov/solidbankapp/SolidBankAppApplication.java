package kz.singularity.bolatov.solidbankapp;

import kz.singularity.bolatov.solidbankapp.model.AccountBasicCLI;
import kz.singularity.bolatov.solidbankapp.service.MyCLI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SolidBankAppApplication {


    public static void main(String[] args) {
        boolean running = true;
        String clientID = "1";
        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        String helpMessange = "1 - show accounts\n2 - create account\3 - deposit\n4 withdraw\n5 transfer\n6 - this massange\n7 - exit\n";
        System.out.printf("Welcome to CLI bank service\n");
        System.out.printf("Enter operation number: \n");
        System.out.printf(helpMessange);
        while (running){
            try {
                AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);

                MyCLI myCLI = context.getBean(MyCLI.class);
                switch (myCLI.getScanner().nextLine()){
                    case "1":
                        accountBasicCLI.getAccounts(clientID);
                        break;
                    case "2":
                        System.out.println("Choose account type: [CHECKING, SAVING, FIXED]");
                        accountBasicCLI.createAccountRequest(myCLI.requestAccountType(), clientID);
                        break;
                    case "6":
                        System.out.printf(helpMessange);
                        break;
                    case "7":
                        System.out.printf("Application Closed\n");
                        running = false;
                        break;
                    default:
                        System.out.printf("Command not recognized!\n");
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Wrong number" + e.getMessage());
            }
        }
    }

}
