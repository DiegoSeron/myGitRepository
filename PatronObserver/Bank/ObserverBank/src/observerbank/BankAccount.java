/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerbank;

import java.util.Observable;

/**
 *
 * @author diego
 */
public class BankAccount extends Observable{
     private double balance;

    public void addAmount(Double amount) {
        this.balance += amount;
        setChanged();
        notifyObservers(balance);
    }

    public Double getBalance() {
        return balance;
    }
}
