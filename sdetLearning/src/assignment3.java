
public class assignment3 {

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
		assignment3 assgObj=new assignment3();
		int z=assgObj.division(10, 2);
		int z1=assgObj.subtraction(z, 2);
		int z2=assgObj.addition(z1, 2);
		int z3=assgObj.subtraction(z2, 2);
		int result=assgObj.multiply(z3,2);
		System.out.println(result);
	}

}
