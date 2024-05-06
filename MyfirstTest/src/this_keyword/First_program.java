package this_keyword;

public class First_program {
	int xyz;//100
	void satyam(int xy)//100
	{
		xyz=xy;//xyz=100;
	}
	void show()
	{
		System.out.println(xyz);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First_program s=new First_program();//Reference Variable 
		s.satyam(100);
		s.show();
	}

}
