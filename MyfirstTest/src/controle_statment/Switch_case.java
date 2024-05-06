package controle_statment;

import java.util.Scanner;
import static_Use.Counter;
public class Switch_case {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Enter the Value1");
		int val1=value.nextInt();//5
		System.out.println("Enter the Value2");
		int val2=value.nextInt();//6
		int reslut;
		System.out.println("Enter the Symbolls +,-,*,/");
		String sym=value.next();//+
		
		switch(sym)//-
		{
		case "+": reslut=val1+val2;
		          System.out.println(reslut);
		          break;
		case "-": reslut=val1-val2;
		          System.out.println(reslut);
		          break;
		case "*": reslut=val1*val2;
                  System.out.println(reslut);
                  break;     
		case "/": reslut=val1/val2;
                  System.out.println(reslut);
                  break; 
       default: System.out.println("Enter the Metioned symbolls only");
    	     
		}

	}

}
