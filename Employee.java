
public class Employee {
	private int id;
	private String name;
	private double balance;
	
	public Employee() {
		this.id=0;
		this.name="";
		this.balance=0;
	}
	
	public Employee(int id, String name, double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
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

	
	public void addSalary(double sal) {
		this.balance+=sal;
	}
}
