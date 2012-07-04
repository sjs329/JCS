package Banking_System;

public class Bank extends MoneyLender {
	
	String[] clients = null;
	
	public Bank(double assets, double interestRate, String[] clients){
		super (assets, interestRate);
		this.clients = clients;
	}

}
