class MathOperation {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add two double numbers
    // double add(double a, double b) {
    //     return a + b;
    // }
    
    public static void main(String[] args) {
        MathOperation mathOp = new MathOperation();
        
        System.out.println("Sum of 2 and 3: " + mathOp.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + mathOp.add(2, 3, 4));
        // System.out.println("Sum of 2.5 and 3.5: " + mathOp.add(2.5, 3.5));
    }
}

