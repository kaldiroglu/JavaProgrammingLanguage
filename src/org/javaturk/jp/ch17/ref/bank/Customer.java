package org.javaturk.ioop.ch18.ref.bank;

public class Customer {
	int id;
	String name;
	
	CreditCard cc;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setCc(CreditCard cc) {
		this.cc = cc;
	}

	public CreditCard getCc() {
		return cc;
	}
}
