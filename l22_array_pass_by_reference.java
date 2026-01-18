import java.util.Arrays;
import java.util.Scanner;
public class l22_array_pass_by_reference {
    public static void main(String [] args){
        // how references work in java
        // when we just use = sign we actually copy the memory address/ reference of the mother array
        Scanner sc = new Scanner(System.in);
        int [] arr1 = {11, 12, 13, 14};
        int [] b;
        b = arr1;
        b[2] = 100;
        System.out.println("arr1 after modifying b: " + Arrays.toString(arr1));
        System.out.println("b: " + Arrays.toString(b));





    }
    
    
}
