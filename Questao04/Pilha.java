package Questao04;
import java.util.ArrayList;
import java.util.LinkedList;

public class Pilha {

    private LinkedList<Carro> pilha;

    public Pilha() {
        this.pilha = new LinkedList<Carro>();
    }

    public LinkedList<Carro> getPilha() {
        return this.pilha;
    }

    public void empilharCom(Carro Carro) {
        pilha.push(Carro);
    }

    public void empilharCom(String nome, int identificador, Proprietario prop) {
        Carro Carro = new Carro(nome, identificador, prop);
        pilha.push(Carro);
    }

    public void empilhar(ArrayList<Carro> Carros) {
        for (int i = 0; i <= Carros.size(); i++) {
            empilharCom(Carros.get(i));
        }
    }

    public void desempilhar() {
       pilha.pop();
    }

    public int quantidadeCarros() {
        return pilha.size();
    }

    public void printaPrimeiroElemento() {
       Carro Carro = this.retornarPrimeiroElemento();
       Carro.printarInformacoes();
    }

    public void printaUltimoElemento() {
        Carro Carro = this.retornarUltimoElemento();
        Carro.printarInformacoes();
     } 

    public void printarELimpaPilha() {
       int maxLimit = this.quantidadeCarros();
        for (int i = 0; i < maxLimit; i++) {
            this.printaPrimeiroElemento();
            this.desempilhar();
        }
        System.out.println("Quantidade de Carros: " + this.quantidadeCarros());
    }

    public void printarPilha() {
        LinkedList<Carro> Carros = new LinkedList<Carro>();
        int maxLimit = this.quantidadeCarros();
        for(Carro Carro: this.pilha) {
            Carros.add(Carro);
        }
        for (int i = 0; i < maxLimit; i++) {
            Carros.pop().printarInformacoes();
        }
        System.out.println("Quantidade de Carros: " + this.quantidadeCarros());
     }

    public Carro retornarPrimeiroElemento() {
        return pilha.getFirst();
    }

    public Carro retornarUltimoElemento() {
        return pilha.getLast();
    }

    public void mostrarPrimeiroCarro() {
       this.retornarPrimeiroElemento().printarInformacoes();
    }
}