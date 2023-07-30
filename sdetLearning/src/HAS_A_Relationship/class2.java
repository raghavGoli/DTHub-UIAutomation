package HAS_A_Relationship;

public class class2 {

	public void method3()
	{
		System.out.println("This is method3");
		
	}
	
	public void method4()
	{
		System.out.println("This is method4");
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is Class2 main method");
		class2 class2obj=new class2();
		class2obj.method4();
		
		class1 class1obj=new class1();
		class1obj.method2();
		//for accessing method2 in class1 definitely another object creation to be done.
		
	}
	
}
