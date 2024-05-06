package static_Use;

import controle_statment.Access;

public class Counter extends Access {
//	
	int abc=120; 
	static int call=20;
	int rbc=130;
	 void display()
	{
		
         System.out.println(abc);
		
		System.out.println("This is the Test");
		
		int xyz = 50;
		
		
		
		
	}
	 void output()
	 {
       //display();
//		 System.out.println(abc);
		 display();
	 }
	 static void test()
	 {
		
	 }
	 static void run()
	 {
		 
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter sat = new Counter();
//		System.out.println(call);
//		System.out.println(Counter.call);
//		System.out.println(sat.call);
//		System.out.println(sat.abc);
		//sat.display();
		//sat.nonstatic();
		//test();
		sat.output();

//		System.out.println(sat.i);
	    
		}

}
