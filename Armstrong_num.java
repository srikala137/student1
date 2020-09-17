package pack_1;
import java.util.*;
public class Armstrong_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int temp=n;
		int d=0;
		int a=0;
		while(n!=0)
		{   
			
			int rem=n%10;
			d++;
			n=n/10;
		}
		temp=n;
		while(n>1)
		{
			int r=n%10;
			 a=a+(int)Math.pow(r,d);
			n=n/10;
			
		}
		if(a==temp)
		{
			System.out.println("it is a armstrong number");
			
		}
		else
		{
			System.out.println("it is not a armstrong number");
		}
		
			}
}
