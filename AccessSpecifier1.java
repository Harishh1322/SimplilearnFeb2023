package mypackage;

class defAccessSpecifier
{
	void display()
	{
		System.out.println("You are using default access specifier");
	}
}

public class AccessSpecifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Default Access specifier");
		defAccessSpecifier obj= new defAccessSpecifier();
		obj.display();
	}

}
