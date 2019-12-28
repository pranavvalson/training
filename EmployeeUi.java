import java.util.*;
public class EmployeeUi {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.execute();
	}
	
	Map<Integer, Employee> store = new HashMap<Integer, Employee>();
	
	public void execute() {
		Employee e1 = new Employee(1, "Prnava", 1000);
		store.put(1,  e1);
		Manager m1 = new Manager(2, "john", 10000);
		store.put(2, m1);
		m1.
	}
	
	
	
	

}
