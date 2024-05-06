package overriding;

public class Vechale {
	void run()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike s=new Bike();
		s.run();
		Car s1=new Car();
		s1.run();
		

	}

}
class Bike extends Vechale
{
	void run()
	{
		System.out.println("This is the bike");
	}
}
class Car extends Vechale
{
	void run()
	{
		System.out.println("This is the Car");
	}	
}
