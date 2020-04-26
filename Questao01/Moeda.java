package Questao01;
/*
A classe moeda deve ter um construtor que inicie os atributos nome e valor 
da moeda e, além dos métodos da interface, os métodos set. 
*/

public class Moeda implements Cambio {
    private String nome;
    private Float valor;

    public Moeda (String nome, Float valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
        this.nome = nome;
		
	}

	@Override
	public Float getValor() {
		return valor;
	}

	@Override
	public void setValor(Float valor) {
		this.valor = valor;
	}
}