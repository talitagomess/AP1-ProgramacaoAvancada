package Questao04;

import java.io.IOException;
import java.util.Scanner;

class Main {
    // Começo de Main
    public static void main(String[] args) throws IOException {
        Pilha pilhaDeCarros = new Pilha();
        menu(pilhaDeCarros);
        System.out.println("Fim do programa!!");
    }
    // Fim de Main

    public static void questionA(Pilha pilhaDeCarros) {
        System.out.println("\n############# Pilha de Espera de Carros #############\n");
        // a) Listar o número de carros aguardando na pilha de espera;
        pilhaDeCarros.printarPilha();
        // Fim da Questão A
    }

    public static void questionB(Pilha pilhaDeCarros) {
        System.out.println("\n############# Autorizar para Retirada #############\n");
        // b) Autorizar a decolagem do primeiro avião da fila;
        if (pilhaDeCarros.quantidadeCarros() > 0) {
            pilhaDeCarros.printaPrimeiroElemento();
            pilhaDeCarros.desempilhar();
        } else {
            System.out.println("Pilha vazia!!");
        }
        // Fim da Questão B
    }

    public static void questionC(Pilha pilhaDeCarros) {
        System.out.println("\n############# Cadastrar Carro e Proprietario para Pilha de Espera #############\n");
        System.out.println("\n ****** Cadastrar Carro ****** \n");
        // c) Adicionar um Carro à pilha de espera;
        Scanner inputA = new Scanner(System.in);
        System.out.println("nome do carro: ");
        String nomeCarro = inputA.nextLine();
        System.out.println("identificador do Carro: ");
        int identifiy = inputA.nextInt();
        System.out.println("\n ****** Cadastrar Proprietario ****** \n");
        Scanner inputB = new Scanner(System.in);
        System.out.println("CPF: ");
        String cpf = inputB.nextLine();
        System.out.println("Nome: ");
        String nomeDoProp = inputB.nextLine();
        Proprietario prop = new Proprietario(nomeDoProp, cpf);
        Carro novoCarro = new Carro(nomeCarro, identifiy, prop);
        System.out.println("\n ****** Pilha de Carros ****** \n");
        pilhaDeCarros.empilharCom(novoCarro);
        pilhaDeCarros.printaPrimeiroElemento();
        // Fim da Questão C
    }

    public static void questionD(Pilha pilhaDeCarros) {
        System.out.println("\n############# Quantidade de Aviões em Espera #############\n");
        // d) Pilha com todos os carros em espera;
        System.out.println(String.format("Quantidade de Carros em Espera: %d", pilhaDeCarros.quantidadeCarros()));
        // Fim da Questão D
    }

    public static void questionE(Pilha pilhaDeCarros) {
        // e) Listar as características do primeiro Carro da pilha.
        if (pilhaDeCarros.quantidadeCarros() > 0) {
            pilhaDeCarros.printaPrimeiroElemento();
        } else {
            System.out.println("Fila vazia!!");
        }
        // Fim da Questão F
    }

    public static void test(Pilha pilhaDeCarros) {
        System.out.println("\n Gostaria de gerar carros automaticos? \n Se sim digite quantos, se não, digite 0: \t");
        Scanner input = new Scanner(System.in);
        int numeroDeCarros = input.nextInt();
        if (numeroDeCarros > 0) {
            for (int count = 0; count < numeroDeCarros; count++) {
                String carName = String.format("Carro %s", count+1);
                String propName = String.format("Proprietario %s", count+1);
                String cpf = String.format("zxz.zxc.x%s", count);
                Proprietario prop = new Proprietario(propName, cpf);
                Carro carro = new Carro(carName, count+1, prop);
                pilhaDeCarros.empilharCom(carro);
            }
        }
        System.out.println("\n Questão A \n");
        questionA(pilhaDeCarros);
        System.out.println("\n Questão B \n");
        questionB(pilhaDeCarros);
        System.out.println("\n Questão C \n");
        questionC(pilhaDeCarros);
        System.out.println("\n Questão D \n");
        questionD(pilhaDeCarros);
        System.out.println("\n Questão E \n");
        questionE(pilhaDeCarros);
    }

    private static void menu(Pilha pilhaDeCarros) { // menu principal
        int opcao = 0;
        do {
            System.out.println("\n\n########### SCC - Sistema de Controle de Carros ###########");
            System.out.println("\n                 ========================================");
            System.out.println("                  |   1 - Pilha de Carros                 |");
            System.out.println("                  |   2 - Autorizar Retirada de Carro     |");
            System.out.println("                  |   3 - Adicionar Carro a Pilha         |");
            System.out.println("                  |   4 - Quantidade de Carros em Espera  |");
            System.out.println("                  |   5 - Primeiro Carro                  |");
            System.out.println("                  |   6 - Teste Automatico                |");
            System.out.println("                  |   0 - Sair                            |");
            System.out.println("                  =========================================\n");

            Scanner input = new Scanner(System.in);
            opcao = input.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    questionA(pilhaDeCarros);
                    break;
                case 2:
                    questionB(pilhaDeCarros);
                    break;
                case 3:
                    questionC(pilhaDeCarros);
                    break;
                case 4:
                    questionD(pilhaDeCarros);
                    break;
                case 5:
                    questionE(pilhaDeCarros);
                    break;
                case 6:
                    test(pilhaDeCarros);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}