/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizzes;

/**
 *
 * @author jdk5786
 */
public class Question {
    protected String text;
    protected String answer;
    
    public Question() {
        text = "";
        answer = "";
        
    }
    public void setText(String t) {
        text = t;
    }
    public void setAnswer(String a) {
        answer = a;
    }
    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }
    
    public void display() {
        System.out.println("text");
    }
}
