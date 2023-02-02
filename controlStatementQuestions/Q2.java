package controlStatement.Questions;

import java.util.Scanner;

//2. Take a year from user and print whether that year is leap year or not
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year: ");
        int year = sc.nextInt();
        if(year%4 == 0){
            if(year % 100 == 0 && year % 400 != 0) System.out.println(year + " is not a leap year.");
            else System.out.println(year + " is a leap year.");
        }
        else System.out.println(year + " is not a leap year.");
    }
}
