package overridde;

public class Dog extends Animal {
	//상속시 부모클래스의 메서드를 재정의 할수 있다.
	@Override
	public void move() {
		super.move();
		System.out.println("Dog Class: move()메서드를 재정의 합니다.");
	}
	
	
}
