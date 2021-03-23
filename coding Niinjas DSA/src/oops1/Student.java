package oops1;

public class Student {

	String name;
	private int age;
	
	public Student(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	public void setaAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}
