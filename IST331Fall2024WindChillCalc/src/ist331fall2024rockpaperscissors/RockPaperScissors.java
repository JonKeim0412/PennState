/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ist331fall2024rockpaperscissors;
import java.util.Random;
import java.util.Scanner;

/**
* @author $jdk5786
* class $RockPaperScissors
* 
**/

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner myS = new Scanner(System.in);
        Random myR = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
            int userChoice = myS.nextInt();

            
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                continue;
            }

            
            int computerChoice = myR.nextInt(3);

            System.out.println("You chose: " + choices[userChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            
            System.out.print("Do you want to play again? (yes/no): ");
            String response = myS.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        myS.close();
    }
}
