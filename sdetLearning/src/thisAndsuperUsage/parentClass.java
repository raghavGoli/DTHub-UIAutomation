package thisAndsuperUsage;

public class parentClass {

	public parentClass() {

		this(3, 4, 5);
		System.out.println("Parent Default constructor");
	}

	public parentClass(int a) {

		this();
		System.out.println("Parent 1 parameterized constructor");
	}

	public parentClass(int a, int b) {

		this(3);
		System.out.println("Parent 2 parameterized constructor");
	}

	public parentClass(int a, int b, int c) {

		System.out.println("Parent 3 parameterized constructor");
	}
}
