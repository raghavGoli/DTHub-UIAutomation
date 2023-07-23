
public class assignment1 {
	
	 int age=32;
	 int rollNum=35773;

	public void display1()
	{
		System.out.println("Automation is very easy");
	}
	public void display2()
	{
		System.out.println("Welcome to all of you");
	}
	public static void main(String[] args) {
		
		assignment1 studentObj =new assignment1();//creating object for student class using new keyword
		studentObj.display1();//calling display1 void method
		studentObj.display2();//calling display2 void method
		System.out.println(studentObj.age);//printing the age variable using reference variable
		System.out.println(studentObj.rollNum);//printing the rollNum variable using reference variable
		
		
	}

}
