/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a7main;

/**
 *
 * @author jonathangarcia
 */
public class A7main {
private double annualinterestRate;
private double balance;
private double totalInterest = 0;

public void withdraw(double userAmount) {
    balance -= userAmount;
}
public void deposit(double userAmount){
    balance += userAmount;
}
public double getBalance() {
    return balance;
}
public double addmonthlyInterest() {
    double monthlyInterest = ((annualinterestRate / 12) * balance);
     balance += monthlyInterest; 
     return monthlyInterest; 
     
}
public void setAnnualinterestrate(double newRate){
    annualinterestRate = newRate / 100; 
    annualinterestRate = newRate;
}
public A7main(double startingBalance){
balance = startingBalance;
annualinterestRate = 0;
    }
    
}
