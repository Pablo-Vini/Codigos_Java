package Logica;

import java.util.Scanner;

public class Excecao2 {

	public static void main(String[] args) {
		
		System.out.println("Entre com um número decimal: ");
		try {
			double num = leNumero();
			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Aconteceu um erro");
			e.printStackTrace();
		}
	}
	
	public static double leNumero() throws Exception{
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}

