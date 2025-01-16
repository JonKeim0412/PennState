/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minmaxfinder;
import java.util.Scanner;

/**
 *
 * @author jdk5786
 */
public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
        int smallest = Integer.MAX_VALUE; // Initialize smallest to the largest possible integer

        System.out.println("Enter a sequence of integers (negative number to terminate):");

        while (true) {
            int input = scanner.nextInt();

            if (input < 0) {
                break; // Exit loop if negative number is entered
            }

            // Update largest and smallest
            if (input > largest) {
                largest = input;
            }

            if (input < smallest) {
                smallest = input;
            }
        }

        // Check if any valid integers were entered
        if (largest == Integer.MIN_VALUE && smallest == Integer.MAX_VALUE) {
            System.out.println("No valid integers were entered.");
        } else {
            System.out.println("Largest value entered: " + largest);
            System.out.println("Smallest value entered: " + smallest);
        }

        scanner.close();
    }
}
