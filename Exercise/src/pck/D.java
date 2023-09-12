package pck;

public class D {
	
	D(){
		System.out.println("constructor");
	}
	D(int a){
		System.out.println("argumented constructor");
	}
	
	public static void main(String[] args) {
		new D();	//Default Constructor 
		
		new D(2);
	}
	
}
