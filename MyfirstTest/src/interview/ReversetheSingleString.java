package interview;

public class ReversetheSingleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sat="Satyam";
		char arr;
		String revv="";
		for(int i=0; i<sat.length(); i++)
		{
			arr=sat.charAt(i);
			
			revv=arr+revv;
			 
		}
		System.out.print(revv);
	}

}
