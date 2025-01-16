/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cryptogram;

/**
 *
 * @author jdk5786
 */
public class Cryptogram {
    // Method to calculate the frequency of each letter in the input text
    public static double[] calculateFrequencies(String text) {
        // Array to store the frequency of each letter from 'a' to 'z'
        int[] letterCounts = new int[26];
        int totalLetters = 0;

        // Convert the text to lowercase to make it case-insensitive
        text = text.toLowerCase();

        // Count the occurrences of each letter (ignoring non-alphabet characters)
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                letterCounts[c - 'a']++;
                totalLetters++;
            }
        }

        // Calculate the relative frequencies (percentages)
        double[] frequencies = new double[26];
        for (int i = 0; i < 26; i++) {
            frequencies[i] = (double) letterCounts[i] / totalLetters * 100; // Percentage
        }

        return frequencies;
    }

    public static void printFrequencies(double[] frequencies) {
        // Print the letter frequencies in a readable format
        System.out.println("Letter Frequencies (a-z):");
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c: %.2f%%\n", (char) ('a' + i), frequencies[i]);
        }
    }

    public static void main(String[] args) {
        // Sample input (you can change this to take user input or read from a file)
        String inputText = "This is a simple cryptogram example. Solve it by analyzing the frequencies.";

        // Calculate frequencies
        double[] frequencies = calculateFrequencies(inputText);

        // Display the frequencies
        printFrequencies(frequencies);
    }
}
 
