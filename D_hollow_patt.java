package pack_3;

public class D_hollow_patt {

	public static void main(String[] args) {
		int n=9;
		int x=n/2+1;
		for(int i=1;i<=n;i++)

		{
			for(int j=1;j<=n;j++)
			{
				if(j==x || j==n-x+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			if(i<=n/2)
				x=x-1;
			else
				x=x+1;
			System.out.println();
		}
	}

}
