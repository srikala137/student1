package pack_1;
import java.util.*;
public class Digit_num {

	public static void main(String[] args) {
		
 Scanner s =new Scanner(System.in);
 System.out.println("enter a number");
 int n =s.nextInt();
 int root=0;
 while(n>0||root>9)
 {
	 /*here root is for sum of digits and again we need 
	 make it a single digit when n becomes zero then 
	 we are placing root in place of n so to make sum 
	 of digits a single number
	 */
	 if(n==0)
	 {	 
	n=root;
	root=0;
     }
	 int rem=n%10;
	 root=root+rem;
	 n=n/10;
 }
	System.out.println(root); 
	}

}
