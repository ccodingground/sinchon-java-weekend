package overridde;

public class MainTest {

	public static void main(String[] args) {
		
		UserCal userCal=new UserCal();
		Calculator cal=new Calculator();
		System.out.println( cal.areaCircle(2) );
		System.out.println( userCal.areaCircle(2) );
		Calculator userCal1=new UserCal();
		System.out.println( userCal1.areaCircle(2) );
		

	}

}
