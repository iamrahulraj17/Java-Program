public class patternn {
    public static void main(String[] args) {
        //1. Hollow square
        System.out.println("1. Hollow square");     
        int n=5;
        int m=5;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m; j++) {
                if(i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 2. Right pyramid
        System.out.println("2. Right pyramid");
        // int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. full pyramid
        System.out.println("3. full pyramid");
        // int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=n-i; j>=1; j--) {
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 4. Number right pyramid
        System.out.println("4. Number right pyramid");
        // int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // 5. Number reverse pyramid
        System.out.println("5. Number reverse pyramid");
        // int n=5;
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // 6. Floyd's triangle
        System.out.println("6. Floyd's triangle");
        // int n=5,
        int c=1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }

        // 7. Binary triangle
        System.out.println("7. Binary triangle");
        // int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j)%2==0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        // 8. Solid rohmbus
        System.out.println("8. Solid rohmbus");
        // int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=n-1; j>=i; j--) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 9. Number pyramid
        System.out.println("9. Number pyramid");
        // int n=5; 
        for(int i=1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // 10. Number pyramid
        System.out.println("10. Number pyramid");
        // int n=5; 
        for(int i=1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        // 11. Rohmbus
        System.out.println("11. Rohmbus");
        // int n=5;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
      
        // 12. Palindrome pattern
        System.out.println("12. Palindrome pattern");
        // int n=5;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=i; k>1; k--){
                System.out.print(k);
            }
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
      
        // 13. Diamond pattern
        System.out.println("13. Diamond pattern");
        // int n=4;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
}
