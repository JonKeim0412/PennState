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

public class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Implement the area method
    @Override
    public double area() {
        return length * width;
    }

    // Implement the perimeter method
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
