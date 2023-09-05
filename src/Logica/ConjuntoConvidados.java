package Logica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadosSet;

	
	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigo) {
		convidadosSet.add(new Convidado(nome,codigo));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigo) {
		Convidado convidadoParaRemover =  null;
		
		for(Convidado c : convidadosSet) {
			if(c.getCodigo() == codigo) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadosSet.remove(convidadoParaRemover);
	}
	
	
	public int contarConvidados() {
		return convidadosSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadosSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		

		conjuntoConvidados.adicionarConvidado(nome: "Convidado 1" , codigo: 1234);
		
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
	}
}
