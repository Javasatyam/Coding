package static_Use;

public class Static_program {
    int abc = 10;
    static int mx = 21; 
	Static_program()
	{
		abc++;
		mx++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_program rms = new Static_program();
		Static_program two = new Static_program();
		Static_program three = new Static_program();
		System.out.println(rms.abc);
		System.out.println(two.abc);
		System.out.println(three.abc);
		System.out.println(mx);
//		System.out.println(mx);
//		System.out.println(mx);

	}

}
