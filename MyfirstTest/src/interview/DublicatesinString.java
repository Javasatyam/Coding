package interview;

import java.util.Map;
import java.util.TreeMap;

public class DublicatesinString {

	public static void main(String[] args) {
		String name="Satyam";
		char [] arr=name.toCharArray();
        char[] dublicates;
		Map<Character,Integer>map=new TreeMap<>();
		for(int i=0; i<arr.length; i++)
		{
		    char xyz=name.charAt(i);
		  for(int j=0; j<arr.length; j++)
		  {
			  if(arr[i]==arr[j])
			  {
				  dublicates=i;
			  }
		  }
		 
		}
	    for(int i=0; i<dublicates i++;)
	    {
	    	
	     }

	
	}

}
