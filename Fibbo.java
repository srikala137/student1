import java.util.*;
public class Fibbo {

	public static void main(String[] args) {
		
     Scanner o=new Scanner(System.in);
     System.out.println("enter anumber");
     
     int n=o.nextInt();
     int t1=0,i;
     int t2=1;
     for(i=1;i<n;i++)
     {
    	 int sum=0;
    	 sum=t1+t2;
    	 t1=t2;
    	 t2=sum;
    	//to print even fibbonaci number in range
     
     if(t1>0)
		{
			if(t1%2==0 && t1<n)
				System.out.print(t1+" ");
		}
	}
	}

}
