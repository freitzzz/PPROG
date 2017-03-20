/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl9.pprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author joaom
 */
public class VencimentosComComparable {
    public static void main(String[] args){
        List<Trabalhador> t=new ArrayList<>();
        TrabalhadorComissao t1=new TrabalhadorComissao("Marcolina", 500, 500, 500);
        TrabalhadorComissao t2=new TrabalhadorComissao("Jacolino", 1000,350, 760);
        TrabalhadorComissao t3=new TrabalhadorComissao("Jose",2000,3123,123); 
        t.add(t1);
        t.add(t2);
        t.add(t3);
        
        //Listagem por ordem crescente
        Collections.sort(t);
        System.out.println("Listagem por ordem crescente\n\n");
        System.out.println(t);
        //Listagem por ordem descrescente
        System.out.println("Listagem por ordem decrescente\n\n");
        Collections.reverse(t);
        System.out.println(t);
    }
}
