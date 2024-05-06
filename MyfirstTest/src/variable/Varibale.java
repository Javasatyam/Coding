package variable;

public class Varibale {
	int a=10; 
	static int b=10;
	
	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Varibale obj=new Varibale();
      Varibale obj2=new Varibale();
      System.out.println("obj1 "+obj.a);//10
      System.out.println("obj2 "+obj2.a);//10
      System.out.println("static"+Varibale.b);//10
		
      obj.a=30;//obj1 a--> 30
//      staticvar1.a=30;
      Varibale.b=40;
      System.out.println("obj1 "+obj.a);
      System.out.println("obj2 "+obj2.a);
      System.out.println("static "+Varibale.b);
      
      
		
		
		

	}

}
