package pack_1;
import java.util.*;
public class rare_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=1+n;
		int i=2;
		while(i*i<=n)
		{
			if(n%i==0)
			{
				if(n%i==i)
					sum=sum+i;
				else
					sum=sum+i+n/i;
				
			}
			i=i+1;
		}
	if(3*n==sum)
		System.out.println("it is a rare number");
	else
		System.out.println("it is not a rare number");	
	}

}
