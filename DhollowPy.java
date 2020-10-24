package pack_3;

public class DhollowPy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int x=n/2+1;
		int a=1;
		for(int i=1;i<=n;i++)

		{
			for(int j=1;j<=n;j++)
			{
				if(j==x || j==n-x+1)
					System.out.print(a);
				else
					System.out.print(" ");
			}
			if(i<=n/2){
				x=x-1;
			a=a+1;
			}
			else{
				
			
				x=x+1;
			a=a-1;
			}
			System.out.println();
		}
		
		
	}

}
