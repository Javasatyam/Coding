package abstraction;

class Bike extends Satyam  {
void SAT()
{
	System.out.println("This is show menthod");
}
void xyz()
{
	
}
Bike()
{
	System.out.println("This is Bike");
}
public static void main(String[] args)	{
//	Bike b=new Bike();
	Satyam b=new Bike();
	
	
}	

}
abstract class Satyam 
{

	abstract void	SAT();

	abstract void xyz();
	  Satyam()
	{
		System.out.println("This is Satyam");
	}
    
	
}
 
