package interview;

import java.util.Map;
import java.util.TreeMap;

public class OccrenceofString {
	
	public static void main(String[] args) {
		String name="Satyam singh";
		char [] arr=name.toCharArray();
		int count=0;
		Map<Character,Integer>map=new TreeMap<>();
		for(int i=0; i<arr.length; i++)
		{
		  count=0;	
		  for(int j=0; j<arr.length; j++)
		  {
			  if(arr[i]==arr[j])
			  {
				  count++;
			  }
		  }
		  map.put(arr[i],count);
		}
	     System.out.println(map);
	}

}
