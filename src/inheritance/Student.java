package inheritance;

public class Student extends Person{
	int stdNo;
	String schoolName;
	
	void display() {
		System.out.println(stdNo);
		System.out.println(schoolName);
		System.out.println(name);//부모클래스의 name
		System.out.println(age);//부모클래스의 age
	}
}
