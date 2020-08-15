package overridde;

public class UserCal extends Calculator{

	@Override
	public double areaCircle(double radius) {
		return 3.14*radius*radius;
	}
}
