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
public abstract class Eletricidade extends Contador{
    private float potencia;
    private static int totalContadoresEletricidade=1;
    private static final String REFERENCIA="ELECT-";
    
    public Eletricidade(String nome,int consumo,float potencia){
        super(nome,consumo,REFERENCIA+totalContadoresEletricidade++);
        this.potencia=potencia;
    }
        
    public Eletricidade(String nome,float potencia){
        super(nome,REFERENCIA+totalContadoresEletricidade++);
        this.potencia=potencia;
    }
    public Eletricidade(int consumo,float potencia){
        super(REFERENCIA+totalContadoresEletricidade++,consumo);
        this.potencia=potencia;
    }
    public Eletricidade(String nome,int consumo){
        super(nome,consumo,REFERENCIA+totalContadoresEletricidade++);
    }
    
    public Eletricidade(String nome){
        super(nome,REFERENCIA+totalContadoresEletricidade++);
    }
    public Eletricidade(int consumo){
        super(REFERENCIA+totalContadoresEletricidade++,consumo);
    }
    
    public float getPotencia(){
        return potencia;
    }
    
    public void setPotencia(float potencia){
        this.potencia=potencia;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nPotência Gasta:"+potencia+"KWH";
    }
    @Override
    public abstract float calculoCustoConsumo();
    
}