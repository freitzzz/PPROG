/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl3.pprog;

import java.util.Calendar;
/**
 *
 * @author joaom
 */
public class PL3PPROG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tempo h1=new Tempo(19,45,58);
        h1.tick();
        //System.out.println(h1);
        Calendar calendario=Calendar.getInstance();
        TesteTempo.main(args);
    }
    
}
