package Questao02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilaContatos fila = new FilaContatos();
        String nome;
        int x, telefone; 
        Scanner entrada = new Scanner(System.in);
        while (true){
        System.out.println("\n\n               ###  Sistema de Controle de Contatos ###");
		System.out.println("\n                  ===============================");
		System.out.println("                  |     1 - Inserir contato     |");
		System.out.println("                  |     2 - Próximo contato     |");
		System.out.println("                  |     3 - Sair                |");
		System.out.println("                  ===============================\n");


        x = entrada.nextInt();

            if (x==1){
                System.out.println("\n\nInsira o nome: ");
                entrada.nextLine();
                nome = entrada.nextLine();
                System.out.println("Insira o telefone: ");
                telefone = entrada.nextInt();
                fila.addContato(nome, telefone);

            }
            
            if (x==2){
                fila.first();
                fila.remover();
            }
            if (x==3){
                
                break;
                
            }
           
        }
         entrada.close();
        
    }
}


