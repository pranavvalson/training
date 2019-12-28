package bank.ui;

import bank.entity.Account;

public class Bank { 
	
	public static void display(Account acc[]) {
		for(Account account: acc) {
			if(account!=null) {
				System.out.println(account);
			}
		} 
	}
	
	public static void main(String[] args) {
		
		Account[] acc = new Account[3];
		
		acc[0] = new Account(1, "Pranav", 1000);
		acc[1] = new Account(2, "John", 2000);
		
		acc[1].transferMoney(acc[0], 500);
		acc[1].addBalance(1000);
		
		display(acc);
	}
} 
