import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Source {
	public static void display(Employee emp) {
		System.out.println("Id :"+emp.getId()+" Name: "+emp.getName()+" Balance:"+emp.getBalance());
	}
	
	public static void print(Employee[] employees) {
		for(Employee e: employees) {
			System.out.println(e.getName()+e.getBalance()); 
			if(e instanceof Manager) { 
				Manager m = (Manager) e; 
				System.out.println("Manager name: "+m.getName());
				Employee[] managedEmployees = new Employee[4];
				managedEmployees = m.getEmployees();
				for(Employee emp: managedEmployees) {
					display(emp);
				} 
			}  
		}
	} 
	
	public static void setDisplay(Set<Employee>set) {
		for(Employee e:set) {
			System.out.println(e.getName());
		}
	}
	
	public static void main(String[] args) {
		
		Employee[] emp=new Employee[4];
		
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
		
		emp[3] = new Employee();
		emp[3] = manager;
		
		print(emp);
		
		Employee e1=new Employee(1, "Wick", 10);
		Employee e2=new Employee(10, "BonJovi",20);
		Employee e3=new Employee(3, "Don", 30);
		Comparator<Employee>comparator=new EmployeeComparator();
		Set<Employee> set=new TreeSet<>(comparator);
		boolean added = set.add(e1);
		set.add(e2); 
		set.add(e3);
		int size = set.size();
		System.out.println("Size :"+size);
		boolean contains = set.contains(e2); 
		System.out.println("Contains e2="+contains);
		
		setDisplay(set);
		
		Map<Integer, Employee>map=new HashMap<>();
		map.put(1, e1);
		map.put(1, e2);
		Employee fetched1=map.get(1);
		Employee fetched2=map.get(2);
		mapDisplay(map);
		
		
		boolean same=e2.equals(e2);
		System.out.println("Same:"+same);
		 
		
	}
	
	
	public static void mapDisplay(Map<Integer, Employee>map) {
		Set<Integer>keys=map.keySet();
		for(int key: keys) {
			Employee value = map.get(key);
			System.out.println(value.getName());
		} 
	}
}
