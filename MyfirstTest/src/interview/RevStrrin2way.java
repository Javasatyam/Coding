package interview;

public class RevStrrin2way {
   
	public static void main(String arg[])
	{
		String name="satyam singh";
		String word="";
		String[] a=name.split("\\s");
		  for(String i:a)
		  {
			  word=word+new StringBuffer(i).reverse().toString();
		  }
		  System.out.println(word);
	}
}
