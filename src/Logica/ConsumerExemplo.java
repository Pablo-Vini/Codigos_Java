package Logica;

import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class ConsumerExemplo {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if (numero % 2 == 0) {
				System.out.println(numero);
			}
		};
		
		numeros.stream().forEach(imprimirNumeroPar);
	}

}
