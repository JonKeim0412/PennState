/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package astriskbox;
import java.util.Scanner;
/**
 *
 * @author jdk5786
 */
public class AsteriskBox {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Get user input for number of columns
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Validate input
        if (rows <= 0 || cols <= 0) {
            System.out.println("Please enter positive integers for rows and columns.");
        } else {
            // Draw the box of asterisks
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("* ");
                }
                System.out.println(); // Move to the next line after each row
            }
        }

        // Close the scanner
        scanner.close();
    }
}
