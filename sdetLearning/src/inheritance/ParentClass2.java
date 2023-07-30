package inheritance;

public class ParentClass2 extends GrandparentClass{

	public static void main(String[] args) {
		
		System.out.println("This is Parent2 Class");
		ParentClass2 p2=new ParentClass2();
		p2.GP1method();// From ParentClass2 we are accessing Grand Parent method
	}
	
		public void P1method()
		{
			System.out.println("This is parent2 first method");
		}

		public void P2method()
		{
			System.out.println("This is parent2 second method");
		}

	

}
