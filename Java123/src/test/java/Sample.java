
public class Sample {
	public int  count(String xyz)
	{
		String [] abc=xyz.split("\\s");
		String countvalue="";
		int num=0;
		for(int i=0; i<=abc.length; i++)
		{
		  
		 num=i;
		}
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		String input1= "pqr abc xyxy kkk abcbb";
          System.out.println(s.count(input1));		

	}

}
