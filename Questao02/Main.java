package Questao02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilaContatos fila = new FilaContatos();
        String nome;
        int x, telefone; 
        Scanner entrada = new Scanner(System.in);

        do {
        System.out.println("\n\n               ###  Sistema de Controle de Contatos ###");
		System.out.println("\n                  ===============================");
		System.out.println("                  |     1 - Inserir contato     |");
		System.out.println("                  |     2 - Próximo contato     |");
		System.out.println("                  |     0 - Sair                |");
		System.out.println("                  ===============================\n");


        x = entrada.nextInt();
            switch (x) {
                    case 1:
                        System.out.println("\n\nInsira o nome: ");
                        entrada.nextLine();
                        nome = entrada.nextLine();
                        System.out.println("Insira o telefone: ");
                        telefone = entrada.nextInt();
                        fila.addContato(nome, telefone);
                        break;
                    case 2:
                        fila.first();
                        fila.remover();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                    }
        } while(x!=0);
        entrada.close();
    }
}


