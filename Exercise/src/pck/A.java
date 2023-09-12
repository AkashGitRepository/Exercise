package pck;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		switch(number) {
		case 1:
			System.out.println("january");
		break;
		case 2:
		System.out.println("feb");
		break;
		case 3:
		System.out.println("march");
		break;
		
		default:
			System.out.println("nothing");
		}
	}
}
