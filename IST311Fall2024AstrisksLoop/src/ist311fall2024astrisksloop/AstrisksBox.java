/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ist311fall2024astrisksloop;
import java.util.Scanner;
/**
 *
 * @author jdk5786
 */
public class AstrisksBox {

 

public class AsterisksBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
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

        scanner.close();
    }
}
}

