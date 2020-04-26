package Questao3;
import java.util.ArrayList;
import java.util.LinkedList;

public class Fila {
    
    private LinkedList<Aviao> fila;

    public Fila() {
        this.fila = new LinkedList<Aviao>();
    }

    public LinkedList<Aviao> getfila() {
        return this.fila;
    }

    public void enfileirarAviaoCom(Aviao aviao) {
        fila.add(aviao);
    }

    public void enfileirarAviaoCom(String nome, int identificador) {
        Aviao aviao = new Aviao(nome, identificador);
        fila.add(aviao);
    }

    public void enfileirarAvioes(ArrayList<Aviao> avioes) {
        for (int i = 0; i <= avioes.size(); i++) {
            enfileirarAviaoCom(avioes.get(i));
        }
    }

    public void desenfileirar() {
       fila.pop();
    }

    public int quantidadeAvioes() {
        return fila.size();
    }

    public void printaPrimeiroElemento() {
       Aviao aviao = this.retornarPrimeiroElemento();
       aviao.printarInformacoes();
    }

    public void printaUltimoElemento() {
        Aviao aviao = this.retornarUltimoElemento();
        aviao.printarInformacoes();
     } 

    public void printarELimpafila() {
       int maxLimit = this.quantidadeAvioes();
        for (int i = 0; i < maxLimit; i++) {
            this.printaPrimeiroElemento();
            this.desenfileirar();
        }
        System.out.println("Quantidade de avioes: " + this.quantidadeAvioes());
    }

    public void printarFila() {
        LinkedList<Aviao> avioes = new LinkedList<Aviao>();
        int maxLimit = this.quantidadeAvioes();
        for(Aviao aviao: this.fila) {
            avioes.add(aviao);
        }
        for (int i = 0; i < maxLimit; i++) {
            avioes.pop().printarInformacoes();
        }
        System.out.println("Quantidade de avioes: " + this.quantidadeAvioes());
     }

    public Aviao retornarPrimeiroElemento() {
        return fila.getFirst();
    }

    public Aviao retornarUltimoElemento() {
        return fila.getLast();
    }

    public void mostrarPrimeiroAviao() {
       this.retornarPrimeiroElemento().printarInformacoes();
    }
}