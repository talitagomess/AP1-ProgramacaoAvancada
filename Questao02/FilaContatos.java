package Questao02;
import java.util.LinkedList;
import java.util.Queue;

public class FilaContatos {

    Queue<Contato> fila = new LinkedList<Contato>();

    void addContato (String nome,int telefone){
        Contato novo = new Contato(nome, telefone);
        fila.add(novo);
    }   
    
    void remover(){
        if (!vazia()) {
            fila.remove();
        }
        
    }

    void first(){
        if (vazia()){
            System.out.println("Não existem contatos cadastrados!");
        }
        else {
            System.out.println(fila.peek().getNome());
            System.out.println(fila.peek().getTelefone());
        }
        
    }

    boolean vazia (){
        return fila.isEmpty();
    }

}