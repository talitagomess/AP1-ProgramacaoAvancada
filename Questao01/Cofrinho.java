package Questao01;
import java.util.ArrayList;

/*
Utilizando ArrayList, implemente um cofrinho de moedas (outra classe) 
com a capacidade de: -receber moedas e -calcular o total depositado no cofrinho. 
A classe cofrinho deve implementar métodos para: 
– Contar o número de moedas armazenadas 
– Contar o número de moedas de um determinado valor 
– Informar qual a moeda de maior valor.
*/ 

public class Cofrinho {
    
    ArrayList<Moeda> cofrinho;

    public Cofrinho() {
        cofrinho = new ArrayList<Moeda>();
    }

    public void receberMoedas(Moeda m) { 
        this.cofrinho.add(m);
    }

    public void TotalDepositado(){ 
        float cont = 0;
        int i;
        if (!vazio()) {
        for(i=0; i < cofrinho.size(); i++) {
            cont = cont + this.cofrinho.get(i).getValor();
        }
        System.out.println("Total depositado no cofrinho: " + cont);   
        } else {
            System.out.println("Não há moedas depositadas! ");
        }
    }
    public void qtdDaMoeda(float x){ 
        int i, cont=0;
        if (!vazio()){
            for(i=0; i<cofrinho.size();i++){
                if (cofrinho.get(i).getValor()== x){
                    cont=cont+1;
                }
                
            }
            System.out.println("Quantidade de moedas de "+ x +" : "+ cont);
        } else {
            System.out.println("Não há moedas depositadas!");
        }
    }

    public void NumMoedasArmazenadas() { 
        if (!vazio()) {
            System.out.println("Número total de moedas armazenadas: " + cofrinho.size());
         } else {
            System.out.println("Não há moedas depositadas!");
         }
    }
        

    public void maiorMoeda() { 
        float maior;
        int i;
        if (!vazio()) {
            maior = cofrinho.get(0).getValor();
            for(i = 0; i < cofrinho.size(); i++) {
                if (cofrinho.get(i).getValor() > maior) {
                    maior = cofrinho.get(i).getValor();
                }
            }
            System.out.println("Maior valor:"+maior);
        }  else {
            System.out.println("Não há moedas depositadas!");
        }
    }

    public boolean vazio () {
        return cofrinho.isEmpty();
    }
}