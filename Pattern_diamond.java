package pack_3;

public class Pattern_diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=3;
        for(int i=n;i>=-n;i--)
        {
        	for(int j=1;j<=Math.abs(i);j++)
        		System.out.print(" ");
        	for(int k=n;k>=Math.abs(i);k--)
        		System.out.print("* ");
        	
        	System.out.println();
        	
        }
	}

}
