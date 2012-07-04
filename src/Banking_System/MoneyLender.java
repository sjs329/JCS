package Banking_System;

public class MoneyLender extends Company {
	
	double interestRate = 0.0;
	
	public MoneyLender( double interestRate, double assets) {
		super(assets);
		this.interestRate = interestRate;
		
	}

}
