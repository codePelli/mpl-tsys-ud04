package Ej05;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		
		int bb = b;
		b = c;
		c = a;
		d = bb;

		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
