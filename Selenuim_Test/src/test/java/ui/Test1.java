package ui;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=0; x<20; x++)
		{
		int primeNUmber=x;
		int flag =0;
		int n;
		n=primeNUmber/2;
		if(primeNUmber==0||primeNUmber==1)
		{
			System.out.println("Not a primeNUmber");
		}
		else
		{
			for(int i=2; i<n; i++)
			{
				if(primeNUmber%2==0)
				{
					System.out.println("Not a primeNUmber" + i);
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println("Prinme"+x);
			}
		}
		
	}		
}
}

