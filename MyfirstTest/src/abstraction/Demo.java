package abstraction;

interface TT// 100%
{
	int s=10;
    void show();
 public static final int i=10;
 default void shw()//
 {
	 
 }
 private void xyz()
 {
	 
 }
 static void swa()
 {
	 
 }
}
interface ss
{
	
}
public class Demo implements TT,ss
{
	public void show()
	{
		
	System.out.println(TT.i);	
	}
	
	public static void main(String arg[])
	{
		TT d=new Demo();
		
	}
}
