package pack_3;

public class Patt_d_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		  int x=1;
		  int j;
	        for(int i=n;i>=-n;i--)
	        {
	        	for( j=1;j<=Math.abs(i);j++)
	        		System.out.print(" ");
	        	if(i>0)
	        		x=1;
	        	else
	        		x=j;
	        	for(int k=n;k>=Math.abs(i);k--)
	        	{
	        		System.out.print((char)(x+64)+" ");
	        	    x=x+1;
	        	}
	        	System.out.println();
	        }
	}

}
