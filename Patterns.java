package controlStatement;
//PATTERNS
public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern 1");

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
        System.out.println("Pattern 3");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Pattern 4");

        int s = 5;
        for(int i = s; i >= 0; i--){
            for(int j = 1; j <= i; j++ ){
                System.out.print(" ");
            }
            for(int k = 1; k<= s-i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("");
        System.out.println("Pattern 5");

        int n = 5;
        for(int i = 0; i < 2*n; i++){
            int cols = i > n ? 2*n-i : i;
            for(int j = 0; j < cols; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
