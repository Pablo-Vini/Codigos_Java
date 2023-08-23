package Matematica;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor, contador, resultado;
		
		System.out.print("Digite um valor para saber seu fatorial: ");
		valor = entrada.nextInt();
		contador = valor;
		resultado = valor;
		
		for(int i=1;i<valor;i++) {
			resultado = resultado * (contador - 1);
			contador = contador - 1;
		}
		System.out.println("O fatorial de " + valor + " é " + resultado);
	}

}
