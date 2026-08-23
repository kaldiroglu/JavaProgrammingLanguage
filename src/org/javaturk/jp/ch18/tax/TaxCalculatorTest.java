package org.javaturk.jp.ch18.tax;

class TaxCalculatorTest {
    void main(){
        TaxCalculator tc = new TaxCalculator();
        double price = 1250;
        double tax = tc.calculateTax(price);
        System.out.println("Tax of " + price + " is " + tax);
    }
}
