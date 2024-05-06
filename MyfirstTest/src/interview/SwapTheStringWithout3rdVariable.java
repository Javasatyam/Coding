package interview;

public class SwapTheStringWithout3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="satyam";
          String s2="Singh";
          s=s+s2;
          s2=s.substring(0, s.length()-s2.length());
          s=s.substring(s2.length());
          System.out.println(s+""+s2);
          
          
          
	}

}
