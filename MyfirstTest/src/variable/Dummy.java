package variable;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 4; 
		for(int i=0; i<row; i++)
		{ // 
			for(int j=0; j<=2*(row-i); j++)
			{
				System.out.print("# ");
			}
			for(int a=0; a<i; a++)
			{
				System.out.println();
			}
		}

	}

}
