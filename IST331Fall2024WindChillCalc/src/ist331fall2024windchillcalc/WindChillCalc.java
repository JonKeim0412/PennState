/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ist331fall2024windchillcalc;
import java.util.Scanner;
/**
 *
 * @author jdk5786
 */
public class WindChillCalc {

    public static double calculateWindChill(double temperature, double windSpeed) {
        
        return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner myS = new Scanner(System.in);

        try {
            
            System.out.print("Enter the temperature in Fahrenheit (between -58 and 48): ");
            double temperature = myS.nextDouble();

            System.out.print("Enter the wind speed in mph (at least 2): ");
            double windSpeed = myS.nextDouble();

            
            if (temperature < -58 || temperature > 48) {
                System.out.println("Error: Temperature must be between -58 and 48 degrees Fahrenheit.");
                return;
            }

            if (windSpeed < 2) {
                System.out.println("Error: Wind speed must be at least 2 mph.");
                return;
            }

            
            double windChill = calculateWindChill(temperature, windSpeed);
            System.out.printf("The wind chill is: %.2f°F%n", windChill);

        } catch (Exception e) {
            System.out.println("Error: Please enter valid numerical values for temperature and wind speed.");
        } finally {
            myS.close();
        }
    }
}
