package Banking_System;

public class Company implements Employer {
	private String name;
	private Person[] employees;
	private double liquidAssets;
	private Product product;
	private double operationalExpenses;
	private Occupation[] occupations;
	
	public boolean payEmployees() {
		return false;
	}
	
	public boolean payExpenses() {
		return false;
	}
	
	public double getOccupationWage(Occupation occ) {
		return occ.getWage();
	}
	public void setOccupationWage(Occupation occ, double wage){
		occ.setWage(wage);
	}
	
	
		
	public Company(double liquidAssets){
		this.liquidAssets = liquidAssets;
	}

}
