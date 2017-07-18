/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl13.pprog;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaom
 */
public class TesteAnimais {
    public static void main(String[] args) {
        Cao c1=new Cao("Bart");
        Cao c2=new Cao("Fido");
        Cao c3=new Cao();
        c3.setNome("Snoopy");
        c3.setTamanho(30);
        Cao[] caes2=new Cao[10];
        caes2[0]=c1;
        caes2[1]=c2;
        caes2[2]=c3;
        c1.setTamanho(70);
        c2.setTamanho(8);
        List<Cao> caes = new ArrayList<>();
        caes.add(c1);
        caes.add(c2);
        caes.add(c3);
        for (Cao cae : caes) {
            if (cae != null) {
                cae.ladra(2);
            }
        }
        for(int i=0;i<caes.size();i++){
            caes.get(i).ladra();
        }
    }
}