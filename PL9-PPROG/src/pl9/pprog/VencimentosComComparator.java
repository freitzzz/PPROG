/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl9.pprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author joaom
 */
public class VencimentosComComparator {
    public static void main(String[] args){
        Comparator<Trabalhador> t=new Comparator<Trabalhador> () {
        
        @Override
        public int compare(Trabalhador t1, Trabalhador t2){
            if(t1.calcularVencimento()>t2.calcularVencimento()){
                return 1;
            }else if(t1.calcularVencimento()<t2.calcularVencimento()){
                return -1;
            }else{
                return 0;
            }
        }
        };
        Comparator<Trabalhador> p=new Comparator<Trabalhador>() {
            @Override
            public int compare(Trabalhador t1, Trabalhador t2) {
                return t1.getNome().compareTo(t2.getNome());
            }
        
    };
        TrabalhadorComissao t1=new TrabalhadorComissao("Jose",1500,3,3);
        TrabalhadorComissao t2=new TrabalhadorComissao("xqosa",1000,4,4);
        TrabalhadorComissao t3=new TrabalhadorComissao("qoso", 2000, 2, 2);
        List<Trabalhador> g=new ArrayList<>();
        g.add(t1);
        g.add(t2);
        g.add(t3);
        g.sort(t);
        //Ordem crescente dos vencimentos. 
        System.out.println("Ordem crescente dos vencimentos.\n\n");
        System.out.println(g);
        //Ordem decrescente dos vencimentos.
        System.out.println("Ordem decrescente dos venciemntos.\n\n");
        Collections.reverse(g);
        System.out.println(g);
        //Ordem alfabetica dos nomes
        System.out.println("Ordem alfabetica dos nomes\n\n");
        g.sort(p);
        System.out.println(g);
    }
}
