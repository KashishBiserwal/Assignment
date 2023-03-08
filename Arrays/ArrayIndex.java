package Arrays;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter " + length + " numbers: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to find its index: ");
        int e = sc.nextInt();
        for (int i = 0; i < length; i++) {
            if(arr[i] == e){
                System.out.println("Index of "+ e + ": " + i);
                break;
            }
        }
    }
}
