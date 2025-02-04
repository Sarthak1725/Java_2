import java.util.ArrayList;

public class ArrayFunction {

    // Method to display an ArrayList
    public void display(ArrayList<Integer> array) {
        System.out.println("ArrayList is: " + array);
    }

    // Method to display an array
    public void displayArr(int[] array) {
        System.out.print("Array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
