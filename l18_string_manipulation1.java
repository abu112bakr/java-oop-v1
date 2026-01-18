import java.util.Scanner;
public class l18_string_manipulation1 {
    public static void main(String [] args){
        // it is possible to create string through class
        // string my_str = new String ("Hello World");
        String s1 = "CSE123";
        //String s2 = new String("CSE123 made using class");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s3 = sc.nextLine(); // read untill /n
        System.out.println("YOU have entered: " + s3);
        System.out.println("Enter a sentence: ");
        String s4 = sc.next(); // read until first white space
        System.out.println("YOU have entered: " + s4);
        s1 = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
        System.out.println("Printing index 5: ");
        System.out.println(s1.charAt(5));





    }
}
