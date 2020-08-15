package inheritance;

public class InheritanceTest02 {

	public static void main(String[] args) {
		
		Student std=new Student();
		
		std.name="학생이름";
		std.age=20;
		std.schoolName="더조은";
		std.stdNo=101;
		
		std.display();
		System.out.println();
		std.disp();//부모의 메서드 호출
		
		Emp emp=new Emp();
		emp.age=30;
		emp.empNo=202001;
		emp.name="회사원";
		emp.salary=100000;
		System.out.println();
		emp.display();
		System.out.println();
		emp.disp();
		
		//extends 클래스이름  : 상속가능 //부모클래스의 자원을 사용가능하다(상속)

	}

}
