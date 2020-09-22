package pack_4;
import java.util.*;
public class Sastry_num {
//It is a number (n) concatenated with (n+1) gives a perfect square.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		String str=Integer.toString(n)+Integer.toString(n+1);
		int num=Integer.valueOf(str);
		double d=Math.sqrt(num);
		if(d-Math.floor(d)==0)
		{
			System.out.println("Sastry number");
			
		}
		else
			System.out.println("Not sastry number");

	}


}
