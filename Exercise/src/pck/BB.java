package pck;

public class BB extends B {
	static int a= 6;
	int b= 10;
	
	void method1 (){
		System.out.println(super.b);
		System.out.println(BB.a);
		System.out.println(B.a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		BB x = new BB ();
		x.method1();
	}
	
}
