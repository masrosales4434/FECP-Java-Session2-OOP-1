package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(123, "Marvin", 1000);

        System.out.println(bankAccount.deposit(1000));
    }
}