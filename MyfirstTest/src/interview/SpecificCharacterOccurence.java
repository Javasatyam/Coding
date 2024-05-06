package interview;

import java.util.Map;
import java.util.TreeMap;

public class SpecificCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Satyam Singha";
		char[] a=s.toCharArray();
		char special='a';
		int count=0;
		Map<Character,Integer>map=new TreeMap<>();
		for(int i=0; i<a.length; i++)
		{
			if(special==a[i])
			{
				count++;
			}
			map.put(special,count);
		}
		
		System.out.println(map);
	}

}
