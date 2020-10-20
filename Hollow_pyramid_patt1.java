package pack_3;

public class Hollow_pyramid_patt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x=n;
		int y=n;
		int a=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*n)-1;j++)
			{
				if(j==x || j==y)
					System.out.print((char)(a+64));
				else
					System.out.print(" ");
			}
				x=x-1;
				y=y+1;
				a=a-1;
			
				System.out.println();
			
				}
	}
	}


