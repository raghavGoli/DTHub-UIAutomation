
public class assignment2 {

	public int addition(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int subtraction(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public int multiply(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public int division(int a,int b)
	{
		int c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
		assignment2 assgObj=new assignment2();
		int z=assgObj.addition(10,2);
		int z1=assgObj.addition(z, 2);
		int z2=assgObj.subtraction(z1, 2);
		int z3=assgObj.multiply(z2, 2);
		int result=assgObj.division(z3, 2);
		System.out.println(result);
	}

}
