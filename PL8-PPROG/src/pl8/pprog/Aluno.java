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
public abstract class Aluno extends Pessoa implements Pagavel{
    private String numero;
    private static final String NUMERO_OMISSAO="";
    
    public Aluno(String numero,String nome){
        super(nome);
        this.numero=numero;
    }
    public Aluno(){
        super();
        numero=NUMERO_OMISSAO;
    }
    
    public void setNumero(String numero){
        this.numero=numero;
    }
    
    public String getNumero(){
        return numero;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nCategoria: Aluno\nNúmero: "+numero;
    }
    public String gastoTotal(){
        
        return "\nGasto Total: "+calcularGasto()+"€";
    }
}
