package pack_1;
import java.util.*;
public class interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter principle");		
		double p = obj.nextDouble();
		System.out.println("enter rate");		
		double r = obj.nextDouble();
		System.out.println("enter time");		
		double n = obj.nextDouble();
		double si = (p*n*r)/100;
		System.out.println("simple interest = "+si);
	}

}
