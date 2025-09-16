package retos;

public class RetoUno {
	public static void main(String[] args) {

		String[] array = {"siuuuu", "petro", "siuuuu", "petro", "siuuu", "petro"};
		String[] finalArray = new String[(array.length + 1) / 2];

		for (int i = 0; i < finalArray.length; i++) {
			finalArray[i] = array[i * 2]; 
		}

		for (String s : finalArray) {
			System.out.print(s + " ");
		}
	}



}



