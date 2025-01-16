/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concatenatestrings;

/**
 *
 * @author jdk5786
 */
public class ConcatenateStrings {
    // Recursive method to concatenate array of Strings into a single String with spaces
    public static String concatenateStrings(String[] array, int index) {
        // Base case: if we've reached the end of the array, return an empty string
        if (index == array.length) {
            return "";
        }
        // Recursive case: add the current element and continue with the next element
        return array[index] + " " + concatenateStrings(array, index + 1);
    }

    public static void main(String[] args) {
        String[] arr = {"Hello", "world", "this", "is", "Java"};
        System.out.println(concatenateStrings(arr, 0)); // Outputs: Hello world this is Java
    }
}