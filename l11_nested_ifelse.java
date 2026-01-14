import java.util.Scanner;
public class l11_nested_ifelse {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("You have entered " + num1);
        if (num1 >0) {
            if (num1 %2==0){
                System.out.println("You have entered positie and even number");
            }
            else {
                System.out.println("You have entered positie and odd number");
            }
        } else {
            if (num1==0) {
                System.out.println("you have entered zero");
            } else if (num1 %2==0) {
                System.out.println("you have entered negative even number");
            } else {
                System.out.println("you have entered negative odd number");
            }
        }

    }
    
}
