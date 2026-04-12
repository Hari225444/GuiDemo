package basic;

public class Parent {
    public static void main(String[] args) {
        // Print text
        System.out.println("This is my first JAVA program");
        
        // Add two numbers
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
        
        //object calling
        System.out.println("I have navigated to home page");
        
        Methods m=new Methods();
        //classobject.methodname
        System.out.println(m.ValidateHeader());
    }
}