import java.util.Scanner;
public class l16_nested_loops_problem {
    public static void main(String[] args){
        // user input 3
        // 123
        // 123
        // 123
        // user input 4
        // 1234
        // 1234
        // 1234
        // 1234
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userinput = sc.nextInt();
        for (int outer = 1; outer<=userinput; outer++){
            for (int inner = 1; inner<=userinput; inner++){
                System.out.print(inner);
            }
            System.out.println();
        }


    }
}

