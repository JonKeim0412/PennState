/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ist311lab1gcd;

import java.util.Scanner;

/**
 *
 * @author jdk5786
 */
public class GCD {

    /**
 * Program Name:                DeleteMe
 * 
 * Functionality:               IST311 Fall 2024 Demo of making conventions, 
 *                              programming style, JavaDoc, etc.
 * 
 * Date:                        4 September 2024 11:43
 * 
 * @author                      Jonathan D. Keim 
 *                              Penn State Berks 
 *                              Reading, PA 19610
 *                              484-941-1332
 *                              jdk5786@psu.edu
 * 
 */
/************************** MODIFICATION LOG **************************
 * 
 * 9 September 2024  Cleaned up code, standardized GUI - jdk5786
 * 
 * 4 September 2024  Initial Program design and basic implementation - jdk5786
 * 
 *********************************************************************/
    
    public static int gcd(int a, int b) 
    {
        a = Math.abs(a);
        b = Math.abs(b);
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
        // TODO code application logic here
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number:\t");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter second integer:\t");
        int secondNumber = scanner.nextInt();
        
        int result = gcd(firstNumber, secondNumber);
        
        System.out.println("The GCD of " + firstNumber + " and " + secondNumber +
                 " is:\t" + result);
        
        scanner.close();
    }
    
}
