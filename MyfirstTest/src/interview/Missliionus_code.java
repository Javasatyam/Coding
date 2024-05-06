package interview;

import java.util.Map;
import java.util.TreeMap;

public class Missliionus_code {
	static void Fibonacci()
	{
		int n1=0;
		int n2=1;
		int n3;
		int count=10;
		System.out.print(n1+""+n2);
	    
		for(int i=2; i<count; i++)
		{
		  n3=n1+n2;
		  System.out.print(" "+n3);
		  n1=n2;
		  n2=n3;
		  
		}
	}
	static void primeNumber()
	{
		int primeNumnber=44;
		int flag=0;
		int n;
		n=primeNumnber/2;
		if(primeNumnber==0||primeNumnber==1)
		{
			System.out.println(primeNumnber+"Not a primeNumber");
		}
		else
		{
			for(int i=2; i<=n; i++)
			{
				if(primeNumnber%i==0)
				{
					System.out.println("Not a primeNumber");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(primeNumnber+"Number is prime");
			}
			
		}
		
	}
	static void factorical()
	{
	    	int fact=5;
	    	int ans = 1;
	    	for(int i=1; i<=fact; i++)
	    	{
	    		 ans=ans*i;
	    	}
	    	System.out.println(ans);
	}
   static void HigestNumber()
   {
	   int [] arr= {2,4,8,23};
	   int value=0;
	   for(int i=0; i<arr.length; i++)
	   {
		   for(int j=0; j<arr.length; j++)
		   {
		   if(arr[i]<arr[j])
		   {
			   value=arr[j];
		   }
		   }
	   }
	   System.out.println(value);
   }
   static void Reversethearray()
   {
	   int [] arr= {2,4,8,23};

	
		   for(int j=arr.length-1; j>=0; j--)
		   {
			   System.out.println(arr[j]);
		   }
		   
		

   }
   static void changethepositionofstring()
   {
	   String s="Satyam"; 
	   String [] arr=s.split(" ");
	   String revv = arr[1]+" "+arr[0];
	   System.out.println(revv);
	   
	   
   }
   static void occurenceofstring()
   {
	   String name="Satyam Singh";
	   char [] arr=name.toCharArray();
	   int count=0;
	   Map<Character,Integer> map=new TreeMap<>();
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
 static void countNumberofword()
 {
	 String s="Satyam Singh H";
	 int count=1;
	 for(int i=0; i<s.length()-1; i++)
	 {
		 if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
		 {
			 count++;
		 }
	 }
	 System.out.println(count);
 }
 static void reversethestring()
 {
   String sat="Satyam Singh";
   String[] arr=sat.split("//s");
   String revword="";
   for(String a:arr)
   {
	   StringBuilder s=new StringBuilder(a);
	   s.reverse();
	   revword+=s.toString()+" ";
	   
   }
   System.out.println(revword);
 }
 static void palidormenumber()
 {
	 int number=121;
	 int revnumber=0;
	 while(number>0)
	 {
		 int lastdigit=number%10;
		 revnumber=revnumber*10+lastdigit;
		 revnumber=revnumber/10;
	 }
	 System.out.println(revnumber);
 }
   static void reversethearray()
    {
	  char[] a= {'a','b','c','d'};
	  int L=0;
	  int R=a.length-1;
	  while(L<R)
	  {
		  char c=a[L];
		  a[L]=a[R];
		  a[R]=c;
		  L+=1;
		  R-=1;
	  }
	  for(int i=0; i<a.length; i++)
	  {
		  System.out.println(a[i]);
	  }
			  
	   
    }
   static void CaseFounderinString()
   {
	   String name="SatyamSingh@";
	   int uppercase=0, lowercase=0, specailcharacter=0;
	   for(int i=0; i<name.length(); i++)
	   {
		   char c=name.charAt(i);
		   if(c>='A'&&c<='Z')
		   {
			   uppercase++;
		   }
		   else if(c>='a'&&c<='Z')
		   {
			   lowercase++;
		   }
		   else
		   {
			   lowercase++;
		   }
	   }
	   System.out.println("Lower case letters : " + uppercase);
       System.out.println("Upper case letters : " + lowercase);
      // System.out.println("Number : " + number);
       System.out.println("Special characters : " + lowercase);
	   
   }
   public static void armgstrongNumber()
   {
	 int n=371;
	 int tempnum=n;
	 double  result=0;
	 while(tempnum>0)
	 {
		 int lastdigit=tempnum%10;
		 result=result+Math.pow(lastdigit, 3);
		 tempnum=tempnum/10;
		 
	 }
	 if(tempnum==n)
	 {
		 System.out.print("Matched");
	 }
   }
   public static void searchingthestringwithposition()
   {
	   String s="My name is satyam";
	   String[] arr=s.split("\\s");
	   String searching="My";
	   
	   for(int i=0; i<arr.length; i++)
	   {
		   
		   if(arr[i].contains(searching))
		   {
			   System.out.println(i+1);
			   break;
		   }
	   }
//	   if(s.contains(searching))
//	   {
//		   
//	   }
   }
   public static  void lefttrigenl()
   {
	   int row=4;
	   int i,j;
	   for(i=0; i<row; i++)
	   {
		   for(j=0; j<=i ; j++)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	     
   }
   public static  void righttrigenl()
   {
	   int row=5;
	   int i,j;
	   for(i=0; i<row; i++)
	   {
		   for(j=1; j<2*(5-i) ; j++)
		   {
			   System.out.print(" ");
		   }
		   for(int a=0; a<=i; a++)
		   {
			   System.out.print("* ");
		   }
        System.out.println(); 
	   }
	     
   }
 
   public static  void leftuppertrigele()
   {
	   int row=5;
	   int i,j;
	   for(i=0; i<row; i++)
	   {
		   for(j=1; j<2*(5-i) ; j++)
		   {
			   System.out.print("* ");
		   }
		   for(int a=0; a<=i; a++)
		   {
			   System.out.print(" ");
		   }
        System.out.println(); 
	   }
	     
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leftuppertrigele();

	}

}
