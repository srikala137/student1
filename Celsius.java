package pack_1;
import java.util.*;
public class Celsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  float f,c;
		  System.out.println("enter Farenheit temperature:");
		  f = sc.nextFloat();
		  c = ((f-32)*5)/9;
		  System.out.println("Celsius = "+c);
	}

}
