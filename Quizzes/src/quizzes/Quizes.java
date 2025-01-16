/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizzes;

import java.util.Scanner;

/**
 *
 * @author jdk5786
 */
public class Quizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        NumericQuestion q2 = new NumericQuestion();
        q2.setText("What is the value of PI?");
        q2.setAnswer("3.1415");
        
        q2.display();
        System.out.println(q2.checkAnswer("3.15"));
        
        
        /*Question q = new Question(); 
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");
        
        q.display(); 
        System.out.print("Enter your answer: ");
        String response = sc.nextLine();
        System.out.println(q.checkAnswer(response));*/
    }
    
}
