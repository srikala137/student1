
public class Pattern4 {

	public static void main(String[] args) {
		for(int i='A'; i<='E';i++) // 5 rows
		{
			for(int j= 'E';j>=i; j--) // 5,4 cols
			{
				System.out.print(i+" "); // A A A A A 
			}
			System.out.println(); //nextline
		}
	}

}
