public class l6_operator3 {

    public static void main(String[] args) {
     System.out.println("Unary Operators");
     System.out.println("Prefix pre-Increment: ++num, value is updated then saved");
     System.out.println("Prefix pre-Decrement: --num, value is updated then saved");
     int a = 5;
     System.out.println("Initial value of a: " + a);
     int b = ++a; // pre-increment: a is incremented before assignment
     System.out.println("b = ++a, Now, a: " + a + ", b: " + b);
     System.out.println("b = ++a, meanns a will be increasd and save into a then b will be updated");
     a = 5;
     System.out.println("Initial value of a: " + a);
     b = --a;
     System.out.println("b = --a, Now, a: " + a + ", b: " + b);
     System.out.println("b = --a, meanns a will be decreased and save into a then b will be updated");


     System.out.println("Postfix Increment: ++num, value is saved then updated");
     System.out.println("Postfix Decrement: --num, value is saved then updated");
     a = 5;
     System.out.println("Initial value of a: " + a);
     b = a++; // post-increment: a is saved before any update
     System.out.println("b = a++, Now, a: " + a + ", b: " + b);
     System.out.println("b = a++, meanns a will be saved into b then a will be updated");
     a = 5;
     System.out.println("Initial value of a: " + a);
     b = a--;
     System.out.println("b = a--, Now, a: " + a + ", b: " + b);
     System.out.println("b = a--, meanns a will be saved into b then a will be updated");

    }
}
