/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ist311fall2024leapyear;

/**
 *
 * @author jdk5786
 */
public class LeapYearChecker {

    
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; 
                } else {
                    return false; 
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

  
    public static void main(String[] args) {
     
        int[] testYears = {1900, 2000, 1996, 2024, 2023};

        for (int year : testYears) {
            System.out.println("Year: " + year + " - Leap Year? " + isLeapYear(year));
        }
    }
}