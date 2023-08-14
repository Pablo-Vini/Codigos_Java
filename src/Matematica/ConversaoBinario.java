package Matematica;

import java.util.Scanner;

public class ConversaoBinario {

	public static void main(String[] args) {
		Scanner scanInt = new Scanner(System.in);
		Scanner scanBin = new Scanner(System.in);
		int valorint;
		String inter;
		String valorbin = "";
		String div = "";
		
		System.out.println("0 - Conversor de Decimal para Binário");
		System.out.println("1 - Conversor de Binario para Decimal");
		System.out.print("==> ");
		int op = scanInt.nextInt();
		if(op == 0) {
			System.out.print("Digite o valor Decimal: ");
			valorint=scanInt.nextInt();
			
			while(valorint > 0) {
				if(valorint % 2 == 0) {
					div = div + "0";
					valorint = valorint / 2;
				}
				else {
					div = div + "1";
					valorint = valorint / 2;
				}
			}
			String resul = new StringBuffer(div).reverse().toString();
			System.out.println("Valor em Binário  " + resul);
			
			
		}
		else if(op == 1) {
			System.out.print("Digite o valor Binário: ");
			valorbin = scanBin.nextLine();
			
			for(int i=0;i<valorbin.length();i++) {
				inter = valorbin.substring(i);
				System.out.println(inter + "...");
			}
			
			
		}
		else {
			System.out.println("\n\nEscolha uma opção válida!\n\n");
		}
	}

}
