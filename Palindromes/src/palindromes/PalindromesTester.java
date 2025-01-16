/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package palindromes;


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

public class PalindromesTester {
    
    public boolean isPalindrome(String input) {
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
        if (input.charAt(left) != input.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
        return true;
    }
    public static void main(String[] args) {
        PalindromesTester tester = new PalindromesTester();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Enter a word to check if its a palindrome: ");
        String userInput = scanner.nextLine();
        
        if (tester.isPalindrome(userInput)) {
            System.out.println("The word is a Palindrome.");
        } else {
            System.out.println("The word is not a Palindrome");
        
        }
        scanner.close();
    }
}
