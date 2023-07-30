package thisAndsuperUsage;

public class childClass extends parentClass {

	public childClass() {

		this(4, 5);
		System.out.println("Child default constructor");
	}

	public childClass(int a) {

		this(3, 4, 5);
		System.out.println("Child 1 parameterized constructor");
	}

	public childClass(int a, int b) {

		super(3, 4);
		System.out.println("Child 2 parameterized constructor");
	}

	public childClass(int a, int b, int c) {

		this();
		System.out.println("Child 3 parameterized constructor");
	}

	public static void main(String[] args) {

		new childClass(23);
	}
}
