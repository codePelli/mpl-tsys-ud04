package Ej03;

public class Ejercicio3 {

	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		double n = 3;
		double m = 4;
		int suma = x + y;
		double dif = x - y;
		double prod = x * y;
		double coc = x / y;
		double resto = x % y;
		int suma2 = (int) (x + n);	
		double coc2 = y / m;
		double resto2 = y % m;
		double sumaTot = x + y + (int) n + (int) m;
		double productoTot = x + y * n * m;
				
		System.out.println("El valor de x es " + x);
		System.out.println("El valor de y es " + y);
		System.out.println("El valor de n es " + n);
		System.out.println("El valor de m es " + m);
		
		System.out.println("La suma es " + suma);
		System.out.println("La diferencia es " + dif);
		System.out.println("El producto es " + prod);
		System.out.println("El cociente es " + coc);
		System.out.println("El resto es " + resto);
		System.out.println("La summa de x y n es " + suma2);
		System.out.println("El cociente de y n es " + coc2);
		System.out.println("El resto de y m es " + resto2);
		System.out.println("El doble de x es " + x * 2);
		System.out.println("El doble de y es " + y * 2);
		System.out.println("El doble de n es " + n * 2);
		System.out.println("El doble de m es " + m * 2);
		System.out.println("La suma de todas las variables " + sumaTot);
		System.out.println("El producto de todas las variables es " + productoTot);

	}

}
