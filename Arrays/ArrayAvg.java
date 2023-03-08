package Arrays;

import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter " + length + " numbers: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        float avg = (float) sum/(arr.length);
        System.out.println("Average of elements of the array: " + avg);
    }
}
