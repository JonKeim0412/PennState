/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anagram;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author jdk5786
 */
public class Anagram {

    // Method to check if two words are anagrams
    public static boolean areAnagrams(String word1, String word2) {
        // Remove any non-alphabetic characters and convert to lowercase
        word1 = word1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        word2 = word2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // If the lengths are different, they cannot be anagrams
        if (word1.length() != word2.length()) {
            return false;
        }

        // Convert both words to character arrays
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        // Sort the character arrays
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        // Compare the sorted arrays
        return Arrays.equals(word1Array, word2Array);
    }

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get the two words from the user
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        // Check if the words are anagrams
        if (areAnagrams(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }
}

