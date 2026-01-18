public class l15_nested_loops {
    public static void main(String []args){
        //while loop
        int outer = 1;
        while (outer <=2) {
            int inner =1;
            while (inner <=3){
                System.out.println("Outer: " + outer + "Innter: " + inner);
                inner++;
            }
            System.out.println("Inner loop sesh");
            outer++;
            
        }
        //For loop
        System.out.println("Now using For loops");
        for (outer = 1 ; outer <=2; outer++){
            for (int  inner = 1; inner <=3; inner++){
                System.out.println("Outer: " + outer + "Innter: " + inner);
                
            }
            System.out.println("Inner loop sesh");
           
        }



        
    }
    
}
