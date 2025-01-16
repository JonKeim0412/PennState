/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radioactivedecay;
import java.util.Scanner;
/**
 *
 * @author jdk5786
 */
public class RadioactiveDecay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Name of the substance
        System.out.print("Enter the name of the radioactive substance: ");
        String substanceName = scanner.nextLine();

        // Input: Half-life of the substance
        System.out.print("Enter the half-life of " + substanceName + " in years: ");
        double halfLife = scanner.nextDouble();

        // Calculate the number of years to decay to less than 2%
        double percentageRemaining = 100.0; // Start with 100%
        int years = (int) 0.0;

        while (percentageRemaining >= 2.0) {
            percentageRemaining /= 2; // Each half-life reduces the amount to half
            years += halfLife; // Increment years by the half-life duration
        }

        // Output the result
        System.out.printf("It will take approximately %.1f years for %s to decay to less than 2%% of its original amount.\n", years, substanceName);

        // Close the scanner
        scanner.close();
    }
}
