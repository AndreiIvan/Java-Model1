package org.example;

public class BankCreditAccount extends BankAccount{

    public void CalculateCreditAmount(int amount, int fee){

        System.out.println("Initially: " + super.AccountMoney);
        System.out.println("Credit card amount: " + amount);
        System.out.println("Credit card monthly fee: " + fee);
    }
}
