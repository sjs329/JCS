package Banking_System;

public class bank_tester {

	public static void main(String[] args){
		String[] clients = {"Carol","Jackie","Scott"};
		
		Bank TD_Bank = new Bank(10000,.15,clients);
		
		for (int i = 0;i<clients.length;i++){
			System.out.println(TD_Bank.clients[i]);
		}
	}
}
