package Logica;

import java.util.Scanner;

public class CalculadoraVelocidadeDownload {
	
	/* *****************************************
 		Teste de aprendizado do Bootcamp da DIO 
	 *******************************************
	 */
	
	
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
            System.out.print("Distancia: ");
            double distanciaServidores = scanner.nextDouble();
            System.out.print("Plano: ");
            double velocidadePlano = scanner.nextDouble();

            //TODO: Calcule a velocidade de download estimada
            double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

            // Apresentar o resultado
            System.out.println("\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

            scanner.close();
        }
    
    
    
    
    
        public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
            return velocidadePlano/(1 + (distanciaServidores/100));

        }
    }