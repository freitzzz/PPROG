/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl6.pprog;

/**
 *
 * @author joaom
 */
public abstract class Contador {
    
    private String nome;
    private int consumo;
    private String id;
    
    private static final int CONSUMO_OMISSAO=0;
    private static final String NOME_OMISSAO="ND";
    
    public Contador(String nome,int consumo,String id){
        this.nome=nome;
        this.consumo=consumo;
        this.id=id;
    }
    
    public Contador(String nome,String id){
        this.nome=nome;
        this.id=id;
        consumo=CONSUMO_OMISSAO;
    }
    
    public Contador(String id,int consumo){
        this.consumo=consumo;
        this.id=id;
        nome=NOME_OMISSAO;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public int getConsumo(){
        return consumo;
    }
    
    public String getID(){
        return this.id;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public void setConsumo(int consumo){
        this.consumo=consumo;
    }
    
    public void setID(String id){
        this.id=id;
    }
    
    
    @Override
    public String toString(){
        return String.format("Nome:%s%nO consumo total do Contador %s é de %d",nome,id,consumo);
    }
    public abstract float calculoCustoConsumo();
}
