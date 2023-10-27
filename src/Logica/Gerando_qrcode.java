package Logica;

import java.util.HashMap;

public class Gerando_qrcode {
    private HashMap<String, Boolean> registros; // Mapa para armazenar o registro de frequência dos alunos

    public Gerando_qrcode() {
        registros = new HashMap<>();
    }

    // Método para registrar a frequência de um aluno
    public void registrarFrequencia(String codigoQR, String nomeAluno) {
        if (registros.containsKey(codigoQR)) {
            registros.put(codigoQR, true); // O aluno está presente
            System.out.println(nomeAluno + " está presente na aula.");
        } else {
            System.out.println("Código QR inválido.");
        }
    }

    // Método para gerar um código QR para um curso
    public String gerarCodigoQR(String codigoCurso) {
        return codigoCurso + "_" + System.currentTimeMillis(); // Usando a hora atual como parte do código
    }

    public static void main(String[] args) {
    	Gerando_qrcode sistema = new Gerando_qrcode();

        // Suponha que você gere um código QR para o curso
        String codigoQR = sistema.gerarCodigoQR("JAVA101");

        // Aluno lê o código QR
        String nomeAluno = "João"; // Nome do aluno
        sistema.registrarFrequencia(codigoQR, nomeAluno);
    }
}

