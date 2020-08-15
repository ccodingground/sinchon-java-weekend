package inheritance;

public class Emp extends Person{
	double salary;
	int empNo;
	
	void display() {
		System.out.println(salary);
		System.out.println(empNo);
		System.out.println(name);//부모클래스의 name
		System.out.println(age);//부모클래스의 age
	}
}
