package inheritance04;

import inheritance04.other.CC;

class AA{
	protected int a=10;
	protected int b=20;
}

class BB extends AA{
	void disp() {
		System.out.println(a);
	}
}




public class Tese01 {

	public static void main(String[] args) {
		
		BB bb=new BB();
		System.out.println(bb.a);
		CC cc=new CC();
		//System.out.println(cc.x);

	}

}
