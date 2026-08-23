package org.javaturk.jp.ch18.tax;

class TaxCalculator {
    public double calculateTax(double price) {
        return price * Tax.VAT_RATE;
    }
}
