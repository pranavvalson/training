
public class Source {
	public static void display(Employee emp) {
		System.out.println("Id :"+emp.getId()+" Name: "+emp.getName()+" Balance:"+emp.getBalance());
	}
	
	public static void main(String[] args) {
		
		Employee[] emp=new Employee[3];
		
		emp[0] = new Employee();
		emp[0].setId(1);
		emp[0].setName("Pranav");
		emp[0].setBalance(100000);
		
		emp[1] = new Employee();
		emp[1].setId(2);
		emp[1].setName("John");
		emp[1].setBalance(1000000);
		
		emp[2] = new Employee();
		emp[2].setId(2);
		emp[2].setName("Sathya");
		emp[2].setBalance(1000000);
		
		Manager manager = new Manager(10, "Manager", 1000000);
		for(int i=0; i<3; i++) {
			manager.setEmployees(emp[i]);
		}
		
		Employee[] sub = new Employee[3];
		sub = manager.getEmployees();
		
		
		System.out.println(manager.getName());
		
		for(int i=0; i<3; i++) {
			display(sub[i]);
		}
		
		
		
		
	}
}
