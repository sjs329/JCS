package Banking_System;

public class Product {	
	private String name;
	private double cost;
	private double price;
	
	public String getName(){
		return name;
	}
	public void SetName(String name){
		this.name = name;
	}
	
	public double getCost(){
		return cost;
	}
	public void Setcost(double cost){
		this.cost = cost;
	}
	
	public double getPrice(){
		return price;
	}
	public void SetPrice(double price){
		this.price = price;
	}

	public Product(String name, double cost, double price){
		this.name = name;
		this.cost = cost;
		this.price = price;
	}

}
