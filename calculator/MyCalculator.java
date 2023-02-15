package calculator;

import java.util.Scanner;

class MyCalculator implements AdvancedArithmetic {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      MyCalculator c = new MyCalculator();
      System.out.print("Enter a number: ");
      int n = sc.nextInt();
      c.divisorSum(n);
   }
}
