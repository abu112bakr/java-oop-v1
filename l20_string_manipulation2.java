import java.util.Scanner;
public class l20_string_manipulation2 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String s1 = "CSE";
        String s2 = "is fun"; 
        String s3 = s1 + " " +s2;
        System.out.println(s3);
        // comparing string values
        String a1 = new String("CSE123");
        String a2 = new String("cse123");
        System.out.println("Compare Case and value");
        System.out.println("s1.equals(s2)"); 
        System.out.println(s1.equals(s2));
        System.out.println("Compare value, ignore case");
        System.out.println("s1.equalsIgnoreCase(s2)"); 
        System.out.println(s1.equalsIgnoreCase(s2));
        //s1.toUpperCase();

    }
    
}
