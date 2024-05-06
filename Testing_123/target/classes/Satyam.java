
public class Satyam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={1,2,3,4,5};
		int rotate=3;
		int l=0;
		int r=arr.length;
		for(int i=0; i<rotate; i++)
		{  
			l=arr[i];
		    if(i<r)
		    {
		    	int a=arr[i];
		    	arr[i]=arr[r];
		    	arr[r]=a;
		    }
		    arr[r--];
		
     	}
		for(int i=0; i<arr.length; i++)
		{  
			System.out.println(arr[i]);
     	}

	}

}
