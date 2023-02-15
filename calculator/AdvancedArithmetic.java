package calculator;

interface AdvancedArithmetic {
     default void divisorSum(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0)
                sum += i;
        }
        System.out.println("Sum of divisors of " +  n + ": " + sum);
    }
}
