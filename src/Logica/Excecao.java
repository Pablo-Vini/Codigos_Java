package Logica;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Excecao {

	public static void main(String[] args) {


		int[] numeros = {4, 8, 16, 32, 64, 128};

		int[] denom = {2, 0, 4, 8, 0};

		for (int i=0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			}catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição do Array invalida");
			}
			finally {
				System.out.println("Linha Finally sempre executa após o catch");
			}
		}
	}
}
