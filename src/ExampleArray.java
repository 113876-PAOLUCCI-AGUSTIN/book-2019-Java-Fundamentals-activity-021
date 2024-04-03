/* Page 243.
 *
 * Activity 21: Finding the Smallest Number in an Array
 * 1. Create a class called ExampleArray and create the main method.
 *
 * 2. Create an array made up of 20 floating points as follows:
 * 14, 28, 15, 89, 46, 25, 94, 33, 82, 11, 37, 59, 68, 27, 16, 45, 24, 33, 72, 51
 *
 * 3. Create a for-each loop through the array and find the minimum element in the array.
 *
 * 4. Print out the minimum float.
 *
 * The solution for this activity can be found on page 335.
 *
 */

public class ExampleArray {
    public static void main(String[] args) {
        // ARRAY LITERAL
        float[] myFnumbers = {14, 28, 15, 89, 46, 25, 94, 33, 82, 11, 37, 59, 68, 27, 16, 45, 24, 33, 72, 51};

        // VARIABLE QUE ALMACENARÁ EL NUMERO MAS CHICO.
        float minNum = myFnumbers[0];

        // FOR QUE RECORRE EL ARRAY Y GUARDA EL NUMERO MAS CHICO.
        for (float i : myFnumbers) {
            if (i <= minNum) {
                minNum = i;
            }
        }
        
    }
}
