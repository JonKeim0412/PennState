/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizzes;

/**
 *
 * @author jdk5786
 */
public class NumericQuestion extends Question {
    private double numericAnswer;
    
    public NumericQuestion() {
        
    }
    
    public boolean checkAnswer(String response) {
        numericAnswer = Double.parseDouble(answer);
        double numResponse = Double.parseDouble(response);
        
        return Math.abs(numResponse-numericAnswer) <= .01;
    }
}
