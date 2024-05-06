package satyam;

interface Xam
{
	void sat();
}
class Name
{
	
}
interface xY extends Name
{
	
}
class New implements  Xam
{

	@Override
	public void sat() {
		System.out.print("Class menthod");
		
	}
	
}
class Y extends  New
{

	@Override
	public void sat() {
		System.out.print("Y me");
		
	}
	
}
public class Add extends Y implements  Xam{
	

	public static void main(String[] args) {
		Xam s=	new Y();
		s.sat();
	}

}
