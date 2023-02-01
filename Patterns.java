package controlStatement;
//PATTERNS
public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1: Star Steps");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Pattern 2");

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("Pattern 3: Number Steps");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Pattern 4: Filled Triangle");
        int n = 5;

        for(int i = 1; i<=5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(" ");
            }
            for(int j =1; j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("Pattern 5: Right Half Diamond");

        for(int i = 1; i <= 2*n; i++){
            int cols = i > n ? 2*n-i : i;
            for(int j = 1; j <= cols; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("Pattern 6: Diamond");

        for(int i = 1; i <= 2*n; i++){
            int spaces = i < n ? n-i+1 : i-n+1;
            for(int k= 1; k<= spaces; k++){
                System.out.print(" ");
            }
            int cols = i < n ? i : 2*n-i;
            for(int j = 1; j <= cols; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("Pattern 7");

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
