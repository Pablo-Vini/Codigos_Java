package Logica;

import java.util.LinkedList;

public class ListaEncadeada {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>();
		
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.addLast("teste");
		lista.add("Elemento 3");
		
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
		lista.remove(1);
		System.out.println(lista);
		
		
	}

}
