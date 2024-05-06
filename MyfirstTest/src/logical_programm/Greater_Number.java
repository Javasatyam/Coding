package logical_programm;

import java.util.Scanner;

public class Greater_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner val=new Scanner(System.in);
		System.out.println("Enter the Value 1");
		int a=val.nextInt();
		System.out.println("Enter the Value 2");
		int b=val.nextInt();
		System.out.println("Enter the Value 3");
		int c=val.nextInt();
       if(a>b && a>c)
       {
    	   System.out.println("A is bigger number"+a);
       }
       else if(b>a && b>c)
       {
    	   System.out.println("B is bigger number"+b); 
       }
       else
       {
    	   System.out.println("C is bigger number"+c);
       }
	}
}
