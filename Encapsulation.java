package mypackage;

class Employee
{
	private int age;
	void setAge(int a)
	{
		if(age>=18&&a<=60)
		{
			age=a;
			System.out.println(age);
		}
		
		else
			System.out.println("Invalid age");
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		//e.age=20;
		e.setAge(18);
	}

}
