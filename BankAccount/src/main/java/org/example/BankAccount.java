package org.example;

public class BankAccount {

    private int accountNumber;
    private String bankAccountHolderName;
    private double availableBalance;


    public BankAccount(int accountNumber, String bankAccountHolderName, double availableBalance) {
        this.accountNumber = accountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
        this.availableBalance = availableBalance;
    }

    public BankAccount(int accountNumber, String bankAccountHolderName) {
        this.accountNumber = accountNumber;
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    public void setBankAccountHolderName(String bankAccountHolderName) {
        this.bankAccountHolderName = bankAccountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String deposit(double amountToDeposit){
        if(amountToDeposit <=0){
            return "Invalid deposit amount.";
        }
        else{
            availableBalance += amountToDeposit;
            return "Successful deposit of user:" +this.bankAccountHolderName+"\nUpdated Balance: "+this.availableBalance ;
        }
    }

    public String withdraw(double amountToWithdraw){
        if (amountToWithdraw > availableBalance){
            return "Invalid withdraw amount.";
        }else{
            availableBalance -= amountToWithdraw;
            return "Successful withdrawal of user:"+this.bankAccountHolderName+ "\nUpdated Balance: "+this.availableBalance;
        }
    }

    public void displayInformation (){
        System.out.println("-----Account Details-----");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Name: " + this.bankAccountHolderName);
        System.out.println("Account Balance: " + this.availableBalance);
    }


}
