public class l25_methods {
    // access_modifier static return_type/void method_name(parameters){}
    public static void myMethod(){
        System.out.println("My method is working");
    }

    public static int add_this(int a, int b){
        int sum = a + b;
        return sum;
    }




    public static void main(String [] args) {
        // we do user defined method, we declar and call
        // public static int add( int a, int b) {}
        // public = access modifier
        // static = belongs to class not object
        // int/void = return type
        // add = method name
        // ( int a, int b) = parameters/ arguments
        myMethod();
        
        int result = add_this(5, 5);
        System.out.println("The sum is: " + result);

    }
}
