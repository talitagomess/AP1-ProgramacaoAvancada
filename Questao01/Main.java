package Questao01;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int x;
    Cofrinho cofre = new Cofrinho();
    String nome;
    float valor;
    Moeda m;
    Scanner entrada = new Scanner(System.in);


    do {
    System.out.println("\n\n                                    ### Cofrinho Virtual ###");
    System.out.println("\n                  ==============================================================");
    System.out.println("                  |     1 - Adicionar moeda                                    |");
    System.out.println("                  |     2 - Número de moedas armazenadas                       |");
    System.out.println("                  |     3 - Quantidade de moedas de um determinado valor       |");
    System.out.println("                  |     4 - Moeda de maior valor                               |");
    System.out.println("                  |     5 - Valor total depositado no cofrinho                 |");
    System.out.println("                  |     0 - Sair                                               |");
    System.out.println("                  ==============================================================\n");

    x = entrada.nextInt();

    switch (x) {
        case 1:
                System.out.println("Nome: ");
                entrada.nextLine();
                nome = entrada.nextLine();
                System.out.println("Valor: ");
                valor = entrada.nextFloat();
                m = new Moeda(nome, valor);
                cofre.receberMoedas(m);
                break;
        case 2:
                cofre.NumMoedasArmazenadas();
                break;
        case 3:
                System.out.println("Valor: ");
                valor = entrada.nextFloat();
                cofre.qtdDaMoeda(valor);
                break;
        case 4:
                cofre.maiorMoeda();
                break;
        case 5:
                cofre.TotalDepositado();
                break;
        case 0:
                break;
        default:
                System.out.println("Opção Inválida!");
                break;
        }

     } while (x!=0);


        entrada.close();
    }
    
}