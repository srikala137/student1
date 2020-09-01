package pack_1;
import java.util.*;
public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner obj =new Scanner(System.in);
     System.out.println("enter a number");
     int n=obj.nextInt();
     while(n!=1)
     {
    	 if(n%2==0)
    	 {
    		 System.out.println(n+" ");
    		 int even=n/2;
    		 n=even;
    	 }
    	 else if(n%2!=0)
    	 {
    		 System.out.println(n+" ");
    		 int odd=(3*n)+1;
    		 n=odd;
    	 }
     }
	}

}
