package Questao03;

import java.io.IOException;
import java.util.Scanner;

class Main {
    // Começo de Main
    public static void main(String[] args) throws IOException {
        Fila filaDeAvioes = new Fila();
        menu(filaDeAvioes);
        System.out.println("Fim do programa!!");
    }
    // Fim de Main

    public static void questionA(Fila filaDeAvioes) {
        System.out.println("\n############# Fila de Espera de Aviões #############\n");
        // a) Listar o número de aviões aguardando na fila de decolagem;
        filaDeAvioes.printarFila();
        //Fim da Questão A
    }

    public static void questionB(Fila filaDeAvioes) {
        System.out.println("\n############# Preparar para Decolar #############\n");
        // b) Autorizar a decolagem do primeiro avião da fila;
        if (filaDeAvioes.quantidadeAvioes() > 0) {  
            filaDeAvioes.printaPrimeiroElemento();
            filaDeAvioes.desenfileirar();
        } else {
            System.out.println("Fila vazia!!");
        }
        //Fim da Questão B
    } 

    public static void questionC(Fila filaDeAvioes) {
        System.out.println("\n############# Cadastrar Avião para Fila Espera #############\n");
        // c) Adicionar um avião à fila de espera;
        // Aviao novoAviao = new Aviao("Gol", 174);
        Scanner input = new Scanner(System.in);
        System.out.println("\n nome \t");
        String nome = input.nextLine(); 
        System.out.println("\n identificador \t");
        int identifiy = input.nextInt();
        Aviao novoAviao = new Aviao(nome,identifiy);    
        filaDeAvioes.enfileirarAviaoCom(novoAviao);
        filaDeAvioes.printaUltimoElemento();
        // Fim da Questão C
    } 

    public static void questionD(Fila filaDeAvioes) {
        System.out.println("\n############# Quantidade de Aviões em Espera #############\n");
        //d) Listar todos os aviões na fila de espera; 
        System.out.println(String.format("%d", filaDeAvioes.quantidadeAvioes()));
        //Fim da Questão D
    } 

    public static void questionE(Fila filaDeAvioes) {
        System.out.println("\n############# Dados do Primeiro Avoão da Fila #############\n");
        //e) Listar as características do primeiro avião da fila.
        if (filaDeAvioes.quantidadeAvioes() > 0) {  
            filaDeAvioes.printaPrimeiroElemento();
        } else {
            System.out.println("Fila vazia!!");
        }
        //Fim da Questão F
    } 

    public static void test(Fila filaDeAvioes) {
        System.out.println("\n Gostaria de gerar aviões automaticos? \n Se sim digite quantos, se não, digite 0: \t");
        Scanner input = new Scanner(System.in);
        int numeroDeAvioes = input.nextInt();
        if (numeroDeAvioes != 0) {
            for (int count = 0; count < numeroDeAvioes; count++) {
                String name = String.format("Aviao %s", count+1);
                Aviao aviao = new Aviao(name, count+1);
                filaDeAvioes.enfileirarAviaoCom(aviao);
            }
        }
        System.out.println("\n Questão A \n");
        questionA(filaDeAvioes);
        System.out.println("\n Questão B \n");
        questionB(filaDeAvioes);
        System.out.println("\n Questão C \n");
        questionC(filaDeAvioes);
        System.out.println("\n Questão D \n");
        questionD(filaDeAvioes);
        System.out.println("\n Questão E \n");
        questionE(filaDeAvioes);
    }

    private static void menu(Fila filaDeAvioes) { // menu principal
	    int opcao = 0;
	    do {
		    System.out
				.println("\n\n########### SCAC - Sistema de Controle de Aviões Comerciais ###########");
		    System.out.println("\n                 ========================================");
	    	System.out.println("                  |   1 - Fila de Decolagem               |");
		    System.out.println("                  |   2 - Autorizar Decolagem             |");
		    System.out.println("                  |   3 - Adicionar Avião a Fila          |");
		    System.out.println("                  |   4 - Quantidade de Aviões em Espera  |");
            System.out.println("                  |   5 - Primeiro Avião                  |");
            System.out.println("                  |   6 - Teste Automatico                |");
		    System.out.println("                  |   0 - Sair                            |");
		    System.out.println("                  =========================================\n");
            
            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();      
		    System.out.print("\n");
		    switch (opcao) {
            case 1:
                questionA(filaDeAvioes);
			    break;
            case 2:
                questionB(filaDeAvioes);
			    break;
            case 3:
                questionC(filaDeAvioes);
                break;
            case 4:
                questionD(filaDeAvioes);
                break;
            case 5:
                questionE(filaDeAvioes);
                break;
            case 6:
                test(filaDeAvioes);
			    break;
            case 0:
			    break;
		    default:
			    System.out.println("Opção Inválida!");
			    break;
            }
        }    while (opcao != 0);
    }
}