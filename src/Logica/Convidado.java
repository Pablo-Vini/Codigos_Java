package Logica;

public class Convidado {

	private String nome;
	private int codigo;
	
	public Convidado(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Convidado{" + "nome=" + nome + '\'' + ", codigo=" + codigo + '}';
	}
}
