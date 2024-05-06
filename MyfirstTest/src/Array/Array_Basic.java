package Array;

public class Array_Basic {
	static int a[]=new int[5];
	
    void sat()
    {
	a[0]=10;//initialization  
	a[1]=20;  
	a[2]=7;  
	a[3]=40;  
	a[4]=50;
	int min=a[0];//10
	for(int i=0; i<a.length; i++)//i=0
	{ 
		if(min<a[i])//10>10=f,10>20=f,10>7t 7>40=f,7>50=f
		{
			min=a[i];//min=7
		}
		
	}
	System.out.println(min);//7
    }
		public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //declaration and instantiation 
			
			Array_Basic st=new Array_Basic();
			st.sat();
		
	}

}
