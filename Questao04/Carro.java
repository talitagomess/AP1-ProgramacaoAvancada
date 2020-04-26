package Questao04;

public class Carro {

	private String nome;
	private int identificador;
	private Proprietario proprietario;

	public Carro(String nome, int identificador, Proprietario prop) {
        this.nome = nome;
		this.identificador = identificador;
		this.proprietario = prop;
		this.proprietario.setCarro(this);
	}
	
	public Proprietario getProprietario() {
		return this.proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
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
		String message = String.format("nome %s, identificador %s, proprietario %s", 
		this.getNome(), this.getIdentificador(), this.proprietario.getNome());
		System.out.println(message);
	}
}