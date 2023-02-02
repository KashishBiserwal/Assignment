package controlStatement.Questions;

import java.util.Scanner;

/* 5.           1
               1 1
              1 2 1
             1 3 3 1
            1 4 6 4 1
*/
public class Q5 {
    public static void main(String[] args) {
        int row, i, j, k, c=1;
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        for (i = 0; i < row; i++) {
            for (j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                if(k==0 || i==0) {
                    c = 1;
                }else{
                    c = c*(i-k+1)/k;
                    System.out.print(" " + c);
                }
            }

            System.out.println();
        }
    }
}
