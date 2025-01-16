package statics;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jdk5786
 */
public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int lastAssignedNumber = 1000;
    
    public BankAccount() {
        lastAssignedNumber++;
        accountNumber = lastAssignedNumber;
        
    }
    
    public void print() {
        System.out.println("last assgned Number: " + lastAssignedNumber);
        System.out.println("Account Number: " + accountNumber);
    }
}
