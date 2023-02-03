package controlStatement.Feb3Qs;

import java.util.Scanner;

public class SpacesInInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(char c: ("" + num).toCharArray()){
            System.out.print(c + " ");
        }
    }
}
