package controlStatement.Feb3Qs;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.println("Maximum: " + Math.max(a,b));
        System.out.println("Minimum: " + Math.min(a,b));
    }
}
