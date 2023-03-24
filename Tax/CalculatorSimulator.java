package Tax;

public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculator();

        try {
            double taxAmount = tc.calculateTax("Krish", true, 600000.0);
            System.out.println("Tax amount is " + taxAmount);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

