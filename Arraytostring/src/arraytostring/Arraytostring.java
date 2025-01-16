/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytostring;

/**
 *
 * @author jdk5786
 */
public class Arraytostring {
    // Recursive method to return a String with elements from first to last
    public static String arrayToString(double[] array, int index) {
        // Base case: if we've reached the end of the array, return an empty string
        if (index == array.length) {
            return "";
        }
        // Recursive case: add current element and call function on next index
        return array[index] + " " + arrayToString(array, index + 1);
    }

    public static void main(String[] args) {
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(arrayToString(arr, 0)); // Outputs: 1.1 2.2 3.3 4.4 5.5
    }
}
