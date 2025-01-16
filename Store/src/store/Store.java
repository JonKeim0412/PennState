/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package store;

/**
 *
 * @author jdk5786
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister reg1 = new CashRegister();
        
        reg1.addItem(3.79);
        reg1.addItem(.89);
        
        System.out.println("# of items bought: " + reg1.getCount());
        System.out.printf("Total price: $ %.2f%n", reg1.getTotal());
        
        reg1.clear();
        
        reg1.addItem(10.5);
        reg1.addItem(2.32);
        
        System.out.println("# of items bought: " + reg1.getCount());
        System.out.printf("Total price: $ %.2f%n", reg1.getTotal());
        
    }
    
 
}
