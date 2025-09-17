package retos;

public class Reto_2 {

	public static void main(String[] args) {

		boolean valor1 = true;
		boolean valor2 = false;

		String resultado1 = convertir(valor1); 
		String resultado2 = convertir(valor2); 

		System.out.println(resultado1);
		System.out.println(resultado2);
	}
	
	public static String convertir (boolean value) {

		if (value) {
			return "ci";
		} else {
			return "nel";
		}
	}
}
