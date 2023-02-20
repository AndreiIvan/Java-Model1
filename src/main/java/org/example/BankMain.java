package org.example;

public class BankMain {

    public static void main(String[] args) {

        BankCreditAccount BankAcc1 = new BankCreditAccount();
        BankAcc1.infoAccount();
        System.out.println("Actual money: " + BankAcc1.AccountMoney);
        BankAcc1.CalculateCreditAmount(10000, 5);

        BankSavingsAccount BankAcc2 = new BankSavingsAccount();
        BankAcc2.CalculateSavingsAmount(2500, 3.75f);


    }
}
