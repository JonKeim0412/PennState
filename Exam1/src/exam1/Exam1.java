/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam1;
import java.util.Scanner;
/**
 *
 * @author jdk5786
 */
public class Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Sandwich mySandwich = new Sandwich();
      System.out.println("What kind of sandwich do you want, hoagie or panini? ");
      String t = sc.next();
      mySandwich.setType(t);
      System.out.println("What kind of meat do you want, turkey, ham, or none? ");
      String m = sc.next();
      mySandwich.setMeat(m);
      System.out.println("What kind of cheese do you want, swiss, chedder, or none? ");
      String c = sc.next();
      mySandwich.setCheese(c);
      System.out.println("Enter how many extras you want: ");
      int e = sc.nextInt();
      mySandwich.setExtras(e);
      
      System.out.println(mySandwich.getType());
      System.out.println(mySandwich.getMeat());
      System.out.println(mySandwich.getCheese());
      System.out.println(mySandwich.getExtras());
      System.out.printf("The price is: %.2f", mySandwich.calcPrice());
    }
    
}