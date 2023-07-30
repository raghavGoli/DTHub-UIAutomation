package inheritance;

public class ParentClass extends GrandparentClass {

	int parentvar =45;
	public static void main(String[] args) {
		
		System.out.println("This is Parent class");
		ParentClass p=new ParentClass();
		p.GP1method();// From ParentClass we are accessing Grand Parent method
		
	}

	public void P1method()
	{
		System.out.println("This is parent first method");
	}

	public void P2method()
	{
		System.out.println("This is parent second method");
	}
}
