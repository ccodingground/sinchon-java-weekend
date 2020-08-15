package encapsulation;

public class Test01 {
	private String name;
	private String email;
	private int age;
	//외부에서는 데이터(멤버필드)에 접근불가
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
