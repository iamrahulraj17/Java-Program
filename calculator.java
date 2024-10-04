import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operator (+,-,*,/,%): ");
        String c = sc.next();
        switch (c) {
            case "+": System.out.println("Sum: "+(a+b));
                break;
        
            case "-": System.out.println("Difference: "+ (a-b) );
                break;
        
            case "*": System.out.println("Multiplication: "+(a*b));
                break;
        
            case "/": System.out.println("Division: "+(a/b));
                break;
        
            case "%": System.out.println("Remainder: "+(a%b));
                break;
        
            default:
                break;

        }
    }
}
