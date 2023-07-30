
public class assignment4 {
	//constructors concept
	
	public assignment4()
	{
		this(3,4,5);
		System.out.println("This is default constructor");
	}
	
	public assignment4(int a)
	{
		this(3,4,5,6);
		System.out.println("This is one parameterized constructor");
	}
	
	public assignment4(int a,int b)
	{
		this();
		System.out.println("This is two parameterized constructor");
	}
	
	public assignment4(int a,int b,int c)
	{
		System.out.println("This is three parameterized constructor");
	}
	
	public assignment4(int a,int b,int c,int d)
	{
		this(3,4);
		System.out.println("This is four parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		new assignment4(3);
		
	}

}
