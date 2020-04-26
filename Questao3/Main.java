package Questao3;

import java.io.IOException;
import java.util.Scanner;

class Main {
    // Começo de Main
    public static void main(String[] args) throws IOException {
        /*
         * a) Listar o número de aviões aguardando na fila de decolagem; 
         * b) Autorizar a decolagem do primeiro avião da fila; 
         * c) Adicionar um avião à fila de espera;
         * d) Listar todos os aviões na fila de espera; 
         * e) Listar as características do primeiro avião da fila.
         */
        Fila filaDeAvioes = new Fila();
        System.out.println("São quantos aviões? \n");
        Scanner input = new Scanner(System.in);
        int numeroDeAvioes = input.nextInt();
        input.close();
        for (int count = 0; count < numeroDeAvioes; count++) {
            String name = String.format("Aviao %s", count+1);
            Aviao aviao = new Aviao(name, count+1);
            filaDeAvioes.enfileirarAviaoCom(aviao);
        }

        // a) Listar o número de aviões aguardando na fila de decolagem;
        filaDeAvioes.printarFila();
        //Fim da Questão A

        // b) Autorizar a decolagem do primeiro avião da fila; 
        filaDeAvioes.printaPrimeiroElemento();
        filaDeAvioes.desenfileirar();
        //Fim da Questão B

        // c) Adicionar um avião à fila de espera;
        Aviao novoAviao = new Aviao("Gol", 174);
        filaDeAvioes.enfileirarAviaoCom(novoAviao);
        // Fim da Questão C
        //d) Listar todos os aviões na fila de espera; 
        filaDeAvioes.printarFila();
        //Fim da Questão D
        //e) Listar as características do primeiro avião da fila.
        filaDeAvioes.printaPrimeiroElemento();
         //Fim da Questão F
    }
    // Fim de Main

}