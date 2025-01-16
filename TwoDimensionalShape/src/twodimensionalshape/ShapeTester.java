/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package twodimensionalshape;


/**
* @author $(user)
* class $(name)
* 
**/

public class ShapeTester {
    public static void main(String[] args) {
        // Creating an array of TwoDimensionalShape objects
        TwoDimensionalShape[] shapes = new TwoDimensionalShape[4];

        // Adding shapes to the array
        shapes[0] = new Rectangle(5.0, 3.0);
        shapes[1] = new Rectangle(7.0, 2.0);
        shapes[2] = new Triangle(4.0, 5.0, 3.0, 4.0, 5.0);
        shapes[3] = new Triangle(6.0, 8.0, 5.0, 5.0, 6.0);

        // Looping through the array and displaying results
        for (TwoDimensionalShape shape : shapes) {
            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println(); // Line break between shapes
        }
    }
}

