package Logica;

import java.util.Scanner;

public class Vetores {

	public Vetores() {
		
	}

	public static void main(String[] args) {
		System.out.println("Vetores Java...");
		Scanner entrada = new Scanner(System.in);
		String[] lista = new String[100];
		int i=0, op=0;
		
		while(true) {
			System.out.println("\n1 - Inserir um nome");
			System.out.println("2 - Confira a lista de nomes ");
			System.out.println("3 - Remover da lista");
			System.out.println("4 - Sair");
			System.out.print("==> ");
			op = entrada.nextInt();
			
			if(op == 1) {
				System.out.print("\nNome: ");
				lista[i] = entrada.next();
			}
			else if(op == 2) {
				for(int l=0;l<lista.length;l++) {
					if(lista[l]==null)
						break;
					System.out.println(lista[l]);
				}
				
			}
			else if(op == 3) {
				for(int l=0;l<lista.length;l++) {
					if(lista[l]==null)
						break;
					System.out.println(l + "  " + lista[l]);
				}
				
				System.out.print("\nEscolha o nome para remover: ");
				int remover = entrada.nextInt();
				
				lista[remover] = "";
				
				for(int j=0;j<lista.length;j++) {
					if(lista[j]==null)
						break;
					System.out.println(j + "  " + lista[j]);
				}
				
			}
			else if(op == 4) {
				System.out.print("\nSaindo...");
				break;
				
			}
			else {
				System.out.println("\nInsira uma opção válida!");
			}
			
			
			i++;
		}

	}

}
