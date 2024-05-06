package static_Use;

public class Static_Block {
    
	int a;
	int b;
	String name;
	static String collage_name;
	void xyz()
	{
		
	}
	void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		int sum= a+b;
		System.out.println(sum);
	}
	void mul(int a,int b)
	{
		this.a=a;
		this.b=b;
		int sum= a*b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Block cal=new Static_Block();
		cal.add(10,20);
		cal.mul(5,4);
		
	}
	

}
