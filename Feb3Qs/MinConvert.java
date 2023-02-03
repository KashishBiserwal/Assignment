package controlStatement.Feb3Qs;

import java.util.Scanner;

//convert minutes to number of years and days  3456789
public class MinConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        int minutes = sc.nextInt();
        int minInADay = 24*60;
        int TotalDays = (minutes/minInADay);
        int years  = TotalDays/365;
        int days = TotalDays-(years*365);
        System.out.println(minutes + " minutes = "+years + " years " + days + " days" );
    }
}
