import java.util.*;
public class UserInput {
     // Method to take Array as input
     public int[] arrInput(){
        Scanner cf = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("enter 5 numbers :");
        for (int i = 0; i < 5; i++) {
            array[i] = cf.nextInt();
            
        }
        return array ;// Return the Array

    }
    

        // Method to take ArrayList as input
   
}
