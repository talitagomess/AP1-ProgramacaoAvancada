package Questao01;
import java.util.ArrayList;

/*
Utilizando ArrayList, implemente um cofrinho de moedas (outra classe) 
com a capacidade de: -receber moedas e -calcular o total depositado no cofrinho. 
A classe Cofrinho deve implementar métodos para: 
– Contar o número de moedas armazenadas 
– Contar o número de moedas de um determinado valor 
– Informar qual a moeda de maior valor.
*/ 

public class Cofrinho {
    ArrayList<Moeda> Cofrinho;


    public void receberMoedas(Moeda m){ 
        this.Cofrinho.add(m);
    }

    public void TotalDepositado(Moeda m){ 
        float cont=0;
        int i;

        for(i=0; i<Cofrinho.size();i++){
            cont = cont + this.Cofrinho.get(i).getValor();
        }

        System.out.println("Total depositado no cofrinho: "+ cont);   
    }

    public void qtdDaMoeda(float x){ 
        int i, cont=0;
        
        for(i=0; i<Cofrinho.size();i++){
            if (Cofrinho.get(i).getValor()== x){
                cont=cont+1;
            }
            
        }
        System.out.println("Quantidade de moedas de"+ x +":"+ cont);

    }

    public void NumMoedasArmazenadas(){ 
        
        System.out.println("Número total de moedas armazenadas: "+ Cofrinho.size());
    }

    public void maiorMoeda(){ 
        float maior;
        int i;

        maior=Cofrinho.get(0).getValor();
        for(i=0; i<Cofrinho.size();i++){
            if (Cofrinho.get(i).getValor()>maior){
                maior = Cofrinho.get(i).getValor();
            }
        }
        
    }



}