package ui;

import java.util.HashMap;

public class Demo {
	 static void reversethearray()
	    {
		  int [] xyz = {1,2,3,4};
		  int L=0;
		  int R=xyz.length;
//		  System.out.println(R);
		  int itration =2;
		 for(int i=0; i<itration; i++)
		  {
			  int c=xyz[R];
			
			  for(int x=0; x<xyz.length-1; x++)
			  {
				  xyz[x]= xyz[x+1];
			  }
			  xyz[0]=c;
			  
//			  xyz[L]=xyz[R];
//			  xyz[R]=c;
//			  L+=1;
			  
		  }
		  for(int i=0; i<xyz.length; i++)
		  {
			  System.out.println(xyz[i]);
		  }
//				
		   
	    }
	 static void Inputa2b3toAAbb()
	 {
		 String s="a2b3c4";
		 for(int i=0; i<s.length(); i++)
		 {
		 if(Character.isAlphabetic(s.charAt(i)))
		 {
			 System.out.print(s.charAt(i));
		 }
		 else
		 {
			int a=Character.getNumericValue(s.charAt(i));
			for(int x=0; x<a; x++)
			{
				System.out.print(s.charAt(i-1));
			}
		 }
	 }

	 }
	 static void Nonrepectedcharacter()
	 {
		 String s="Satyam";
		 HashMap<Character,Integer> m=new HashMap<>();
		 for(int i=0; i<s.length(); i++)
		 {
			 char c=s.charAt(i);
			 if(m.get(c)==null)
			 {
				 m.put(c,1);
			 }
			 else
			 {
				 m.put(c,m.get(c)+1);
			 }
		 }
		 for(int i=0; i<s.length(); i++)
		 {
			 char c=s.charAt(i);
			 if(m.get(c)==1)
			 {
				 System.out.println(c);
			 }
		 }
	 }	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonrepectedcharacter();
//		String str = "Your order value is $44.34";
//	    int position=str.indexOf("$");
//	    System.out.println(position);
//	    String intvalue=str.substring(position+1).trim();
//	    Double value=Double.parseDouble(intvalue);
//	    
//	    System.out.println(value*5);
	    
	    
		
		
	}

}
