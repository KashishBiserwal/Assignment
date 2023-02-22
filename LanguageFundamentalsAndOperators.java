package com.cognizant.tax;

class TaxCalculator {
    float basicSalary;
    boolean citizenship;
    float tax;

//    // constructor to initialize instance variables
    public TaxCalculator(float basicSalary, boolean citizenship) {
        this.basicSalary = basicSalary;
        this.citizenship = citizenship;
    }

    // method to calculate tax
    public void calculateTax() {
        float tax = 30 * basicSalary / 100;
        System.out.println("The Tax of the employee for the " + basicSalary + " is " + tax);
        this.tax = tax; // store calculated tax in instance variable
    }

    // method to deduct tax from basic salary
    public void deductTax() {
        int netSalary = (int) (basicSalary - tax); // type casting float to int
        System.out.println("The net salary of the employee " + netSalary);
    }

    // method to validate salary and citizenship eligibility
    public void validateSalary() {
        boolean response = basicSalary > 100000 && citizenship;
        System.out.println("The salary and citizenship eligibility: " + response);
    }
}

public class LanguageFundamentalsAndOperators {
    public static void main(String[] args) {
        TaxCalculator taxCalc = new TaxCalculator(25000, true);
        taxCalc.calculateTax();
        taxCalc.deductTax();
        taxCalc.validateSalary();

        taxCalc = new TaxCalculator(125000, true);
        taxCalc.calculateTax();
        taxCalc.deductTax();
        taxCalc.validateSalary();
    }
}
