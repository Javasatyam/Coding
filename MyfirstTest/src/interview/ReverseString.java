package interview;

public class ReverseString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Satyam Singh";
		String[] arrOfStr=name.split("\\s");
		
		String reverseWord ="";
		for(String a:arrOfStr)
		{
			StringBuilder sb=new StringBuilder(a); 
			sb.reverse();
//			reverseWord+=sb.toString()+" "; 
			System.out.println(sb);
		}
		System.out.println(reverseWord.trim());
	}

}
