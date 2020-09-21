package pack_1;
import java.util.*;
public class Abundunt_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n= 12
		if(display(n) > n) // 16 > 12
			System.out.println("Abundant Number");
		else
			System.out.println("Not Abundant Number");
			
}
	// sum of proper factors(excluding given num) greater than number is abundunt number
/*	
 static int display(int n)
 {
	 int sum=0;
	 int i=1;
	 while(i*i<=n)
	 {
		 if(n%i==i)
		 {
			 sum=sum+i;
		 }
		 else
		 {
			 sum=sum+i+n/i;
		 }
		 i++;
	 }
	 sum=sum-n;
	 return sum;
 }
 */
  static int display(int n)
  {
  int sum=0;
  for(int i=1;i<=Math.sqrt(n);i++)
  {
   if(n%i==0)
     sum=sum+i+n/i;
  }
  sum=sum-n;
  return sum ;  
    
  } 
  
	}



