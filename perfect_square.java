package pack_1;
import java.util.*;
public class perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number");
        int a=obj.nextInt();
        double x=Math.sqrt(a);
        System.out.println(x);
        if( ( x - Math.floor(x)) == 0)
   		 System.out.println("Square Number");
   	else
   		System.out.println(" Not Square Number ");
	}

}
