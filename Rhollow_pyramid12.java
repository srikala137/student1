package pack_3;

public class Rhollow_pyramid12 {

	public static void main(String[] args) {
		int n=5;
		int x=1;
		int y=2*n-1;
		int a=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=(2*n)-1;j>=1;j--)
			{
				if(j==x || j==y)
					System.out.print((char)(a+64));
				else
					System.out.print(" ");
			}
				x=x+1;
				y=y-1;
				a=a-1;
			
				System.out.println();
			
				}
	}
	}


