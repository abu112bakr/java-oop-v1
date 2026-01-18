import java.util.Scanner;
public class l17_break_continue {
    public static void main(String [] args){
        //Break statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ID(1-10): ");
        int id = sc.nextInt();
        for (int i=1; i<=10; i++){
            if ( i ==id){
                System.out.println("ID " + i +" Kuje peyechi");
                break;
            }
            System.out.println(i);
        }
        System.out.println("Loop er bairee");
        // Continue statment
        System.out.println("continue statement");
        System.out.println("amra 6 number and kake chocklate dibo na? ");
        int dibona = sc.nextInt();
        for (int i=1; i<=10; i++){
            if ( i == 6 || i ==dibona){
                System.out.println("ID " + i +" ke chocklate dibo na");
                continue;
            }
            System.out.println("ID " + i + " ke chocklate dilam");
        }
    }

}
