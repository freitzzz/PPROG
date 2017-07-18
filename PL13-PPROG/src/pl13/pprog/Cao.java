/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl13.pprog;

/**
 *
 * @author joaom
 */
public class Cao {
    private String nome;
    private int tamanho;
    
    public Cao(String nome){
        this.nome=nome;
    }
    public Cao(){
        
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setTamanho(int tamanho){
        this.tamanho=tamanho;
    }
    
    public String getNome(){
        return nome;
    }
    public int getTamanho(){
        return tamanho;
    }
    
    public void ladra(){
        String som;
        if(tamanho>60){
            som="Uff! Uff!";
        }else if(tamanho<20){
            som="Ruff! Ruff!";
        }else{
            som="Ip! Ip!";
        }
        System.out.println(nome+" a ladrar "+som);
    }
    public void ladra(int numeroVezes){
        while(numeroVezes-->0){
            ladra();
        }
    }
    public void cacaGatos(){
        System.out.println(nome+" a caçar gatos.");
    }
    
    
}
