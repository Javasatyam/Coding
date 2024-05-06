
public class ABC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Great responsibility";
		char[] a=s.toCharArray();
		for(int xyz=0; xyz<=a.length xyz++)
		{
			for(int j=0; j<=a.length; j++)
			{
				if(a[j]==a[xyz])
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}
