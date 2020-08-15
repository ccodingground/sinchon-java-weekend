package encapsulation;

public class MainTest01 {

	public static void main(String[] args) {
		
		Test01 test01=new Test01();
		//객체생성
		//Test01 멤버에 접근하기위한 권한.
		//test01.name="ttt";
		//System.out.println(test01.name);
		test01.setName("더조은");
		
		System.out.println("이름 : "+ test01.getName());
	}

}
