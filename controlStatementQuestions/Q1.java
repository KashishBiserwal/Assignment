package controlStatement.Questions;

//1. sum of first 10 natural number
public class Q1 {
    public static void main(String[] args) {
        int sum = 0, n = 10;
        for(int i = 1; i<= n; i++){
            sum += i;
        }
        System.out.println("Sum of first "+ n + " natural numbers: " + sum);
    }
}
