import java.util.Scanner;
public class l7_userinput {
    public static void main(String [] args) {
        System.out.println("We read unser input using scanner, and this scanner is in a package");
        System.out.println("import Java.util.Scanner; this is before the class");
        System.out.println("after importing scanner, we have to create an object of scanner class");
        // Scanner sc = new Scanner(System.in);
        System.out.println("Scanner sc = new Scanner(System.in);");
        System.out.println("Scanner sc 'is the variable' = new Scanner 'new object banacchi'(System.in 'System er vitor banacchi');");
        System.out.println("Type of Scanning ways are");
        System.out.println("nextInt (), NextLong (),NextFloat (), nextDouble(), nextBoolean (), nextLine (), next ()");
        Scanner sc = new Scanner(System.in);
        //int input
        System.out.println("int num1 = sc.nextInt(); taking input");
        System.out.println("Enter an Integer value: ");
        int num1 = sc.nextInt();
        System.out.println("You have entered " + num1);
        System.out.println("int num1 = sc.nextInt(); taking input");
        System.out.println("Enter an Integer value: ");
        num1 = sc.nextInt();
        System.out.println("You have entered " + num1);
        
        // string input whole line
        sc.nextLine(); //breaking the previous int input sequence
        System.out.println("sc.nextLine(); //breaking the previous int input sequence");
        System.out.println("SString str1 = sc.nextLine();");
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println("You have entered: " + str1);
        // string input untill the first white space
        // sc.nextLine(); //breaking the previous int input sequence
        // System.out.println("sc.nextLine(); //breaking the previous int input sequence");
        System.out.println("SString str1 = sc.nex();");
        System.out.println("Enter a string: ");
        str1 = sc.next();
        System.out.println("You have entered: " + str1+ " Took till the first white space");






    }


}
