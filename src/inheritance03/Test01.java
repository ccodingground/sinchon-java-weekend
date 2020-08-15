package inheritance03;

class DDD{
	String car="티코";
	
}

public class Test01 extends DDD{
	String car="모닝";
	
	void disp() {
		System.out.println(car);
	}
	void disp2() {
		System.out.println(super.car);
	}
}
