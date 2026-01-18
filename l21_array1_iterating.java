import java.util.Arrays;
import java.util.Scanner;
public class l21_array1_iterating {
    public static void main (String [] args){
        // in java array is an object

        Scanner sc = new Scanner(System.in);
        int [] arr1 = new int [3];
        int [] arr2 = new int [] {11, 12, 13, 14};
        int [] arr3 = {11, 12, 13, 14, 15};
        // arr1, arr2, arr3 contian only memory address.
        // we need to store this vlaues in a array representation to see them
        System.out.println("arr1: "+arr1+" arr2:"+arr2+" arr3: "+arr3);
        // we do this uings Arrays.toString(arr1)
        System.out.println("using Arrays.toString(arr1)");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println("array length is "+arr1.length);
        System.out.println(arr3[1]);
        System.out.println(arr3[arr3.length -1]);
        arr3[1]= 100;
        System.out.println(Arrays.toString(arr3));

        // making arry from scratch using user input
        System.out.println("insert size of the array");
        int size = sc.nextInt();
        int [] myarr = new int [size];
        for (int i=0; i<size; i++){
            System.out.println("insert value for index " + i);
            int elem = sc.nextInt();
            myarr[i] = elem;
        System.out.println("End of Loop");
        System.out.println(Arrays.toString(myarr));

        }
    }
     
}
