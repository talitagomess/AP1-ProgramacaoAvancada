package Questao01;
/*
A classe moeda deve ter um construtor que inicie os atributos nome e valor 
da moeda e, além dos métodos da interface, os métodos set. 
*/

public class Moeda {

    String nome;
    Float valor;

    public Moeda (String nome, Float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return this.valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

}