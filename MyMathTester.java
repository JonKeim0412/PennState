/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ist311fall2024secondnamingconv;

import java.util.*;


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

public class MyMathTester 
{
    boolean bDebugging = false;
    protected int intOne;
    public static void main(String[] args) 
    {
        MyMathTester myMT = new MyMathTester();
        Scanner myS = new Scanner(System.in);
        int intOne = 0;
        int intTwo = 0;
        System.out.print("Please enter the first number:\t");
        intOne = myS.nextInt();
        System.out.println("");
        System.out.print("Please enter the second number:\t");
        intTwo = myS.nextInt();
        System.out.println("");
        
      if (myMT.bDebugging)
      {
        System.out.print("The largest of intOne and intTwo (" + intOne + ") and " 
                + "intTwo (" + intTwo + ") is ");
        System.out.println(MyMath.findLargest(intOne, intTwo));
        
        
        System.out.print("The smallest of intOne and intTwo (" + intOne + ") and " 
                + "intTwo (" + intTwo + ") is ");
        System.out.println(MyMath.findSmallest(intOne, intTwo));
      }
    }
    
}
