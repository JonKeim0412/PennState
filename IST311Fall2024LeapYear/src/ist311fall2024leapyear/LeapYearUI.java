/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ist311fall2024leapyear;
import java.util.Scanner;

/**
* @author $(user)
* class $(name)
* 
**/


public class LeapYearUI {

    public static void main(String[] args) {
       
        Scanner myS = new Scanner(System.in);

        System.out.println("Enter a year to check if it is a leap year: ");
        
       
        int year = myS.nextInt();

        
        if (LeapYearChecker.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

       
        myS.close();
    }
}
