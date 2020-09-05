package pack_1;
import java.util.*;
public class Spy_num {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	int temp=num;
	int sum=0,n;
	int mul=1;
	while(num!=0)
	{
		n=num%10;
		sum=sum+n;
		mul=mul*n;
		num=num/10;
	}
     if(sum==mul)
     {
    	 System.out.println(temp+" is a spy number");
     }
     else
     {
    	 System.out.println(temp+" is  not a spy number");
     }
	}

}
