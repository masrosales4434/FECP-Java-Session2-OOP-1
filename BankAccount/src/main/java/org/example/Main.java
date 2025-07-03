package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> listOfBankAccounts = new ArrayList<>();

        BankAccount bankAccount = new BankAccount(123, "Marvin", 1000);

        System.out.println(bankAccount.deposit(1000));
        bankAccount.displayInformation();


        Scanner input = new Scanner(System.in);
        int menuChoice;


        do{
            System.out.println("=====The Blue Bank=====");
            System.out.println("1. Create Account");
            System.out.println("2. View All Accounts");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            menuChoice = input.nextInt();
            input.nextLine();

            switch(menuChoice){
                case 1:
                    System.out.print("Enter Account Number: ");
                    int inputAccNumber = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Account Name: ");
                    String inputAccName = input.nextLine();

                    int withInitialDeposit = 0;
                    do{
                        System.out.println("Do you want to make an initial deposit (1 if yes | 0 if no)?");
                        withInitialDeposit = input.nextInt();
                    }while (withInitialDeposit <0 || withInitialDeposit >1);

                    if(withInitialDeposit == 1){
                        System.out.print("Enter initial deposit: ");
                        double inputInitialDeposit = input.nextDouble();
                        try{
                            listOfBankAccounts.add(new BankAccount(inputAccNumber,inputAccName,inputInitialDeposit));
                        }catch(IllegalArgumentException e){
                            System.out.println(e.getMessage());
                            break;
                        }
                    }else{
                        listOfBankAccounts.add(new BankAccount(inputAccNumber,inputAccName));
                    }
                case 2:
                    for (BankAccount b : listOfBankAccounts){
                        b.displayInformation();
                    }

            }


        }while(menuChoice != 6);
    }
}