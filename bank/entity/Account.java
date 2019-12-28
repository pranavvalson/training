package bank.entity;

public class Account {
	private int id;
	private String name;
	private double balance;
	
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) { 
		this.id = id;
	}
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addBalance(double balance) {
		this.balance+=balance;
	}
	
	public void transferMoney(Account acc, double money) {
		this.balance-=money;
		acc.addBalance(money);
	} 
	
	@Override
	public String toString() {
		String display = this.id+" "+this.name+" "+this.balance;
		return display;
	}
	
}
