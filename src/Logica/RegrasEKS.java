package Logica;

import java.util.Scanner;
import java.lang.Math;

public class RegrasEKS {
	
	/* *****************************************
		Teste de aprendizado do Bootcamp da DIO 
	 *******************************************
	*/
	
	
    public static void main(String[] args) {
        // Definindo as regras básicas
        double podsPorNode = 10;
        double podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        System.out.print("Quantidade Pods: ");
        double numeroTotalPods = scanner.nextInt();

        //TODO: Calcule o número mínimo de nodes necessários
        int numeroMinimoNodes = (int) Math.round(numeroTotalPods / podsPorNode);
        System.out.println("Nodes " + numeroMinimoNodes + " divisao " + numeroTotalPods / podsPorNode);
        
        //TODO: Calcule o número mínimo de servidores necessários
        int numeroMinimoServidores = (int) ((numeroTotalPods / podsPorServidor) + 1);

        //TODO: Exiba o resultado com as recomendações de quantidades de servidores e nodes.
        if(numeroMinimoNodes <= 1){
          System.out.println("1.Recomendamos usar um unico node");
        }
        else{
          System.out.println("1.Numero minimo de nodes:" + numeroMinimoNodes);
        }
        System.out.println("2.Numero minimo de servidores:" + numeroMinimoServidores);
        // Fechando o Scanner
        scanner.close();
    }
}
