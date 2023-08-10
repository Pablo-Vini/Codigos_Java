package Logica;

public class MyException{

	public static void main(String[] args){


		int[] numeros = {4, 8, 16, 32, 63, 128};

		int[] denom = {2, 0, 4, 8, 0, 2, 4};

		for (int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			}
		}
	}
}
