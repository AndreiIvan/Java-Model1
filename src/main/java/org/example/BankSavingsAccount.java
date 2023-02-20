package org.example;

public class BankSavingsAccount extends BankAccount{

        public void CalculateSavingsAmount(int amount, float interest) {
                System.out.println("Initially: " + super.AccountMoney);
                System.out.println("Credit card amount: " + amount);
                System.out.println("Credit card monthly fee: " + interest);
        }

}
