package static_Use;

import java.util.Scanner;

 class Example {
	void display()
	{
		System.out.println("Satyam");
	}
	static void run()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example simmy = new Example();
        simmy.display();
        Test.role();
        run();
        
	}

}
class Test
{
	static void role()
	{
		System.out.println("This is static method");
	}
}
