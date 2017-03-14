/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl8.pprog;

/**
 *
 * @author joaom
 */
public abstract class Pessoa implements Pagavel{
    private String nome;
    private static final String NOME_OMISSAO="";
    
    public Pessoa(String nome){
        this.nome=nome;
    }
    
    public Pessoa(){
        nome=NOME_OMISSAO;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    @Override
    public String toString(){
        return "Nome: "+nome;
    }
    
    @Override
    public abstract float calcularGasto();
}
