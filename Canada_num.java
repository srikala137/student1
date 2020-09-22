package pack_4;
import java.util.*;
//It is a number where the sum of squares of the digits of n is equal to the sum of non-trival divisors of n.

public class Canada_num {
 static int dig_sq(int n)
 {
	 int rem=0;
	 int sum=0;
	 while(n!=0)
	 {
	  rem=n%10;
	  sum=sum+rem*rem;
	  n=n/10;
	 }
	return sum;  
 }
static int div(int n)
{
	int sum=0;
	for(int i=1;i<=Math.sqrt(n);i++)
	{
		if(n%i==0)
			sum=sum+i+n/i;
	}
	return (sum-1-n);
}
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	if(dig_sq(n)== div(n))
	{
		System.out.println("it is a canada number");
	}
	else{
		System.out.println("not a canada number");
	}
	}

}
