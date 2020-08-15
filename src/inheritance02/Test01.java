package inheritance02;

public class Test01 {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		Mammal m=new Mammal();//Animal을 상속하고있는 클래스
		Dog d= new Dog();
		//포유동물은 동물입니다. Mammal is a Animal
		System.out.println(m instanceof Animal);
		//강아지는 포유동물입니다. Dog is a Mammal
		System.out.println(d instanceof Mammal);
		//강아지는 동물입니다. Dog is a Animal
		System.out.println(d instanceof Animal);
		//상속의 유형중
		//IS-A관계
		

	}

}
