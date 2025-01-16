/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ist311lab1gcd;


/**
 * Program Name:                GCDTester
 * 
 * Functionality:               IST311 Fall 2024 Demo of making conventions, 
 *                              programming style, JavaDoc, etc.
 * 
 * Date:                        18 September 2024 12:46
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

public class GCDTester 
{
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
    }
    
    public static void runTests() 
    {
        System.out.println("Running tests...\n");
        /* 
        I used arrays to make this easier.
        */
        int[][] testCases = {
            {48, 18},
            {64, 10},
            {72, 27},
            {100, 10},
            {0, 7},
            {0, 0},
            {-3000, 12},
            {50, -25},
            {1200, 100},
            
    };
        
        int[] expectedResults = {
            4, 2, 9, 10, 7, 0, 12, 25, 100
        };
        
        for (int i = 0; i < testCases.length; i++){
            int a = testCases[i][0];
            int b = testCases[i][1];
            int result = gcd(a, b);
            System.out.println("gcd(" + a + ", " + b + ") = " + result + " | "
                    + "Expected: " + expectedResults[i] + " | Test " + (result == expectedResults[i] ? "Passed" : "Failed"));
        }
    }
    public static void main(String[] args) {
            runTests();
        }
}

