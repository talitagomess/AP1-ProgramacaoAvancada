package Questao02;

public class Contato {

    private String nome;
    private int telefone;


    public Contato (String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }



}