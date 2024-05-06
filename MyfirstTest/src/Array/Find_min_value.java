package Array;

public class Find_min_value {
	static void min(int a[])
	{
	  int min=a[0];
	  for(int i=0; i<a.length; i++)
	  {
		  if(min>a[i])
		  {
			  min=a[i];
		  }
	  }
	  System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={99,20,50,70};
		min(a);
	}

}
