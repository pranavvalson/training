
import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(cal.add(a,b));
		System.out.println(cal.subtract(a,b));
	}
}
		
		
