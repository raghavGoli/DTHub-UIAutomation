package inheritance;

public class SingleInheritance extends ParentClass {

	public static void main(String[] args) {

		SingleInheritance sin = new SingleInheritance();// creating object for the current class
		System.out.println(sin.parentvar); // as the current class is inheriting the "ParentClass" it is able to access
											// the parent class variable.
		sin.P1method();// parent class method1
		sin.P2method();// parent class method2

	}

}
