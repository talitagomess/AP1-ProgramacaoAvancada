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
    int i;
    float cont;

    public void receberMoedas(Moeda m){ 
        this.Cofrinho.add(m);
    }
    public void contarTotalDepositado(Moeda m){ 
        cont = 0;
        for(i=0; i<Cofrinho.size();i++){
            cont = cont + this.Cofrinho.get(i).getValor();
        }
        
    }

}