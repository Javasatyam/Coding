package selectionsort;

public class Select_for_loop {
	Select_for_loop()
	{
		int temp;
		int a[]= {2,55,90,4,43};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0; i<a.length; i++)
		{
		    System.out.println(a[i]);
		}
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Select_for_loop s=new Select_for_loop();

	}

}
