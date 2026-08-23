package org.javaturk.jp.ch17.ref.bank;

class CreditCard {
    String no;
    double balance;

    Customer owner;

    CreditCard(String no, double balance) {
        this.no = no;
        this.balance = balance;
    }

    CreditCard(String no, double balance, Customer owner) {
        this.no = no;
        this.balance = balance;
        this.owner = owner;
        owner.setCc(this);
    }

    void setOwner(Customer owner) {
        this.owner = owner;
    }

    Customer getOwner() {
        return owner;
    }
}
