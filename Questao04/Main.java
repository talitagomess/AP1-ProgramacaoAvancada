package Questao04;

import java.io.IOException;
import java.util.Scanner;

class Main {
    // Começo de Main
    public static void main(String[] args) throws IOException {
        /*
            Uma balsa que faz travessia de carros  
            O primeiro  carro  a  entrar  é  o último  a  sair.  
            A  empresa  necessita  manter  um  cadastro  de  todos  os  veículos
            Seus respectivos  proprietários  que  entraram  na  balsa
            A  checagem  de  veículo  e  dono será   feita   no   momento   de   desembarque.   
            Implemente um software em Java que possibilite tal operação.
        */
        Pilha PilhaDeCarros = new Pilha();
        System.out.println("\n São quantoscarros? \t");
        Scanner input = new Scanner(System.in);
        int numeroDeCarros = input.nextInt();
        input.close();
        for (int count = 0; count < numeroDeCarros; count++) {
            String carName = String.format("Carro %s", count+1);
            String propName = String.format("Proprietario %s", count+1);
            String cpf = String.format("cpf 123%s", count+1);
            Proprietario prop = new Proprietario(propName, cpf);
            Carro carro = new Carro(carName, count+1, prop);
            PilhaDeCarros.empilharCom(carro);
        }
        System.out.println("\n Questão A \n");
        questionA(PilhaDeCarros);
        System.out.println("\n Questão B \n");
        questionB(PilhaDeCarros);
        System.out.println("\n Questão C \n");
        questionC(PilhaDeCarros);
        System.out.println("\n Questão D \n");
        questionD(PilhaDeCarros);
        System.out.println("\n Questão E \n");
        questionE(PilhaDeCarros);
    }
    // Fim de Main

    public static void questionA(Pilha PilhaDeCarros) {
        PilhaDeCarros.printarPilha();
    }

    public static void questionB(Pilha PilhaDeCarros) {
        PilhaDeCarros.printaPrimeiroElemento();
        PilhaDeCarros.desempilhar();
    } 

    public static void questionC(Pilha PilhaDeCarros) {
        Proprietario novoProp = new Proprietario("Jailsom", "12345666");
        Carro novoCarro = new Carro("Gol", 174, novoProp);
        PilhaDeCarros.empilharCom(novoCarro);
        PilhaDeCarros.printaPrimeiroElemento();
    } 

    public static void questionD(Pilha PilhaDeCarros) {
        PilhaDeCarros.printarPilha();
    } 

    public static void questionE(Pilha PilhaDeCarros) {
        PilhaDeCarros.printaPrimeiroElemento();
    } 
}