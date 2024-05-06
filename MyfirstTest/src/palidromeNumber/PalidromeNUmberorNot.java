package palidromeNumber;

public class PalidromeNUmberorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=100;
         int temp=n;
         int r,sum = 0;
         while(n>0)
         {
        	 r=n%10;
        	 sum=(sum*10)+r;
        	 n=n/10;
        	 
         }
         if(temp==sum)    
        	   System.out.println("palindrome number ");    
          else    
        	  System.out.println("not palindrome");  
	}

}
