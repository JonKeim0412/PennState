/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package store;

/**
 *
 * @author jdk5786
 */
public class CashRegister {
    private int itemCount;
    private double totalPrice;
    
    
    public CashRegister() {
        itemCount = 0;
        totalPrice = 0;
    }
    
    public void addItem(double price){
        itemCount++;
        totalPrice += price;               
    }
    public int getCount() {
        return itemCount;
        
    }
    public double getTotal() {
        return totalPrice;
    }
    public void clear() {
        itemCount = 0;
        totalPrice = 0;
    }
}
