package col;
import java.util.*;


public class ArraylistEx {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(5);
		list.add(2);
		Object o = list.get(0);
		int firstElement = (int) 0;
		System.out.println(firstElement);
		ArraylistEx ex=new ArraylistEx();
		ex.print(list);
		System.out.println("----------------------");
		ex.sort(list);
		ex.print(list);
		list.remove(1); 
		list.add(1, 2);
		System.out.println("----------------------");
		ex.print(list);
		
	} 
	
	public void printIterator(List list) {
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object o=iterator.next();
			System.out.println(o);
		} 
	}
	
	public void print(List list) { 
		for (Object e:list) {
			int num=(int) e;
			System.out.println(num);
		}
	}
	
	public void sort(List list) {
		IntegerComparator comparator = new IntegerComparator();
		list.sort(comparator);
	}
	
}
