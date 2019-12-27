
public class Manager extends Employee {
	
	private Employee[] emp = new Employee[3];
	public int count = 0;
	
	public Manager() {
		this.setId(0);
		this.setBalance(0);
		this.setName("");
	}
	
	public Manager(int id, String name, double balance) {
		super(id, name, balance);
	}
	
	public void setEmployees(Employee employee) {
		emp[count] = new Employee();
		emp[count] = employee;
		count++;
	}
	
	public Employee[] getEmployees() {
		return emp;
	}
	
	
};
