package org.javaturk.jp.ch17.ref.bank;

class Customer {
    int id;
    String name;

    CreditCard cc;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void setCc(CreditCard cc) {
        this.cc = cc;
    }

    CreditCard getCc() {
        return cc;
    }
}
