package overridde;

public class Test {
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.move();
		
		Animal a=new Animal();
		a.move();
		//Dog is a Animal 
		
		//다형성
		Animal aD= new Dog();
		aD.move();
		
		Object oAD= new Dog();
		
		
	}
}
