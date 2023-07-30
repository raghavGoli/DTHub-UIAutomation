package IS_A_Relationship;

public class class2 extends class1{

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
		class2obj.method2(); //Using class2 object itself we were able to call the method2() in class1
		// so using one object we can call the methods in current class and the super class also.
	}
	
}
