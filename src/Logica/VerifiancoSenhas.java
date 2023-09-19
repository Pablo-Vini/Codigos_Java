package Logica;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VerifiancoSenhas {
	
	/* *****************************************
	 	Teste de aprendizado do Bootcamp da DIO 
	 *******************************************
	 */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a senha para verificar a força: ");
            String senha = scanner.nextLine();
            //scanner.close();

            String resultado = verificarForcaSenha(senha);
            System.out.println(resultado);
        }




        public static String verificarForcaSenha(String senha) {
            int comprimentoMinimo = 8;
            String senhaTeste = senha;
            String resultado;
            // Critérios de validação usando expressões regulares
            boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senhaTeste).find();
            boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senhaTeste).find();
            boolean temNumero = Pattern.compile("\\d").matcher(senhaTeste).find();
            boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senhaTeste).find();
            boolean temSequenciaComum = senhaTeste.matches(".*(?i)123456.*|.*(?i)abcdef.*");
            boolean temPalavraComum = senhaTeste.equalsIgnoreCase("password") || senhaTeste.equalsIgnoreCase("123456") || senhaTeste.equalsIgnoreCase("qwerty");

            // TODO: Verifique o comprimento mínimo e critérios de validação
            
            if(senhaTeste.length() < comprimentoMinimo){
              resultado = "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
            }
            else if(temLetraMaiuscula == true && temLetraMinuscula == true && temNumero == true && temCaractereEspecial == true) {
            	resultado = "Sua senha atende aos requisitos de seguranca. Parabens!";
            	
            }
            else {
              resultado = "Sua senha nao atende aos requisitos de seguranca.";
            }
            return resultado;


        }
    }

