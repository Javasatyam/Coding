package interview;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     int[] arr= {3,9,7,6};
     int x=9;
     int temp=0;
     for(int i=0; i<arr.length; i++)
     {
    	 for(int j=1; j<arr.length; j++)
    	 {
    		 if(arr[i]>arr[j])
    		 {
    			temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    		 }
    	 }
     }
     System.out.println(temp);
}
}
