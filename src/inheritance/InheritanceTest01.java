package inheritance;

public class InheritanceTest01 {

	public static void main(String[] args) {
		
		Sub sub=new Sub();
		System.out.println( sub.a );
		System.out.println( sub.b );
		
		Super super1=new Super();
		System.out.println( super1.a );
		System.out.println( super1.b );

	}

}
