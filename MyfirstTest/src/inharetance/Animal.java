package inharetance;

import java.util.Scanner;

public class Animal {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Satyam Singh";
		String rev = "";
		String[] arry=s.split("\\s");
		for(int i=arry[0].length()-1; i>=0; i--)
		{
			char arr=arry[0].charAt(i);
			rev=rev+arr;
		    if(i<=0)
		    {
		    	  for(int j=arry[1].length()-1; j>=0; j--)
			      {
				   char xyz=arry[1].charAt(i);
				    rev=rev+xyz;
			      }
			    }
		    }
		}
		System.out.print(rev);
	}
}