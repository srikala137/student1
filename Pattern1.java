package pack_4;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i='E'; i>='A';i--) 
		{
			for(int j= 'A';j<=i; j++) 
			{
				System.out.print((char)i+" "); 
			}
			System.out.println(); 
		}
	}

}
