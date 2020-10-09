package pack12;

public class Patterna {

	public static void main(String[] args) {
		int n=4;
		int stars=n*2-1;
		for(int i=n;i>=1;i--)
		{
			for(int j=n-1;j>=i;j--)
				System.out.print(" ");
			for(int k=1;k<=stars;k++)
				System.out.print("*");
			System.out.println();
			stars=stars-2;
		}
	}

}
