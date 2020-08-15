package overridde;

public class Animal {//Object클래스를 상속받고있습니다.
	//상속시에 메서드 중복할수 없습니다.
	public void move() {
		System.out.println("Anmail Class: move()메서드");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
