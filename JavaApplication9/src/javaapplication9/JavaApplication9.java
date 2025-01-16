/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;
/**
 *
 * @author jdk5786
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        /*int month = 4;
        System.out.println("Enter a month as an integer: ");
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "Fall";
        else season = "Bogus Month";
        System.out.println("April is in the " + season + ".");
        
        System.out.println("Enter a string that you want reversed: ");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        for(int i = str.length() - 1; i >= 0; i--) {
        reverse = reverse + str.charAt(i);
    }
        
        System.out.println("Reversed string is: " + reverse);*/
        
    public static final int TICKET_COUNT = 100;
    
    public static final int TICKET_MAX_PER_USER = 4;

   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int tickets = TICKET_COUNT;
        int buyers = 0;
        
        System.out.println(tickets + " tickets will be sold.");

        while(tickets > 0) {         
            System.out.println("How many tickets would you like to buy?");
           
            int count = in.nextInt();
          
            if(count < 0 || count > TICKET_MAX_PER_USER) {
                System.out.println("You can only buy up to " + TICKET_MAX_PER_USER + " tickets.");
                continue;
            }
        
            if(count == 0) {
                System.out.println("You don't want to buy any tickets, bye!\n");
                continue;
            }    
            if(tickets < count) {
                System.out.println("There are only " + tickets + " ticket(s) left.");
                continue;
            } 
            tickets -= count;
            buyers++;
            System.out.println("You've bought " + count + " ticket(s)!\n");
        }

        
        System.out.println("All tickets have been sold, to " + buyers + " buyers.");
    }
    
}
