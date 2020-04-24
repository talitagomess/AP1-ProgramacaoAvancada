package Questao3;

public class Aviao {

	private String nome;
	private int identificador;

	public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void printarInformacoes() {
		String message = String.format("nome %s, identificador %s", this.getNome(), this.getIdentificador());
		System.out.println(message);
	}
}