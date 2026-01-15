import java.util.Scanner;
public class l14_max_value {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int maxval = 0;
        for (int i=1; i<=5; i++){
             System.out.println("Enter a number");
             int num = sc.nextInt();
             if (i ==1){
                maxval = num;
             } else {
                if (num > maxval) {
                    maxval = num;
                }
             }
        } 

        System.out.println("The maximum value is "+ maxval);
    }
    
}
