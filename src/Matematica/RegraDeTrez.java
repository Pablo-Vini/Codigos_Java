package Matematica;

import java.util.Scanner;

public class RegraDeTrez {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor1, valor2, valor3, x;
		
		System.out.println("Adicione os seguintes valores");
		System.out.println("\nRegra de Trez:    valor 1  ----   x     ");
		System.out.println(".                 valor 2  ---- valor 3 \n");
		
		System.out.print("Valor 1: ");
		valor1 = entrada.nextInt();
		
		System.out.print("Valor 2: ");
		valor2 = entrada.nextInt();
		
		System.out.print("Valor 3: ");
		valor3 = entrada.nextInt();
		
		System.out.println("");
		System.out.println("");
		System.out.println("	" + valor1 + " ---- " + "x");
		System.out.println("	" + valor2 + " ---- " + valor3);
		
		System.out.println("");
		System.out.println("O valor de x é " + (valor1*valor3)/valor2);
	}

}
