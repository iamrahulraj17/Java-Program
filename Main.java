import java.util.*;

class Main{
    public static int productOfTwoNumber(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int product = productOfTwoNumber(a, b);
        System.out.println("Product of "+a+" & "+b+" is "+product);
    }
}