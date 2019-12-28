package wallet.ui;

import java.util.*;

import wallet.entity.*;

public class WalletIneterface {
	public static void main(String[] args) {
		
		WalletIneterface account = new WalletIneterface();
		account.execute();
	}
	
	Map<Integer, Wallet> store=new HashMap<Integer, Wallet>();
	
	public void execute() {
		
		Wallet w1 = new Wallet("9895553566", "John", 500);
		Wallet w2 = new Wallet("8137816685", "Pranav", 200);
		
		store.put(1, w1);
		store.put(2, w2);
		
		w1.transferBalance(w2, 100); 
		
		print(store); 
		
		System.out.println("-------------------");
		
		String searchedNumber = "9895553566";
		getCustomerDetails(store, searchedNumber);
				
	}
	
	public void print(Map<Integer, Wallet> map) {
		Set<Integer> keys = map.keySet();  
		for(int key: keys) { 
			Wallet w = map.get(key);  
			System.out.println(w);
		} 
	}
	
	public void getCustomerDetails(Map<Integer, Wallet> map, String number) {
		Set<Integer> keys = map.keySet();
		for(int key: keys) {
			Wallet w = map.get(key);
			boolean found=w.checkNumber(number);
			if(found) {
				System.out.println("Found Customer");
				System.out.println(w);
				return;
			}
		}
		System.out.println("Not  Found!");
	}
}
