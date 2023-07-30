package inheritance;

public class MultilevelInheritance extends ParentClass {

	public static void main(String[] args) {

		MultilevelInheritance multi = new MultilevelInheritance();
		System.out.println(multi.grandparentvar); // can access Grandparent class variable as again ParentClass inherits
													// Grandparentclass
		System.out.println(multi.parentvar);// can access parent variable as the current class inherits ParentClass
		multi.GP1method();// can access Grandparent class 's method1
		multi.GP2method();// can access Grandparent class's method2
		multi.P1method(); // can access Parent class method1
		multi.P2method();// can access Parent class method2
	}

}
