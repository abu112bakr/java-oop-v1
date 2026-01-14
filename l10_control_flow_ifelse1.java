import java.util.Scanner;

public class l10_control_flow_ifelse1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number greatr than 10");
        int num1 = sc.nextInt();
        if (num1>10) {
            System.out.println("you have entered " + num1);
        } else if (num1 ==10) {
            System.out.println("You have entered exactly 10");
        } else {
            System.out.println("You have entered less than 10");
        }

        System.out.println("last line of the code");
    }
}
