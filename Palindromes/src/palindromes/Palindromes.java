/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromes;

/**
 *
 * @author jdk5786
 */
public class Palindromes {

    /**
     * @param args the command line arguments
     */
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
        
    }
}
   
