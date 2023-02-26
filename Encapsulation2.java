package mypackage;

class Student
{
	private int rollNo;
	private String name;
	private String course;
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName() {//Getters and setters are used to protect your data, particularly when creating classes. For each instance variable, a getter method returns its value while a setter method sets or updates its value
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	
}

public class Encapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.setRollNo(555);
		s.setName("Harish");
		s.setCourse("B.TECH");
		System.out.println("Roll Number : "+s.getRollNo());
		System.out.println("Name :"+s.getName());
		System.out.println("Course :"+s.getCourse());
	}

}
