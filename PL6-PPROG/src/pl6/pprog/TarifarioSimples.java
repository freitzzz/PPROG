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
public class TarifarioSimples extends Eletricidade{
    private static float potenciaContratada=6.9f;
    private static float tarifario1=0.13f;
    private static float tarifario2=0.16f;
    
    public TarifarioSimples(String nome,int consumo,float potencia){
        super(nome,consumo,potencia);
    }
    public TarifarioSimples(String nome,float potencia){
        super(nome,potencia);
    }
    public TarifarioSimples(int consumo,float potencia){
        super(consumo,potencia);
    }
    public TarifarioSimples(String nome,int consumo){
        super(nome,consumo);
    }
    public TarifarioSimples(String nome){
        super(nome);
    }
    public TarifarioSimples(int consumo){
        super(consumo);
    }
    
    @Override
    public float getPotencia(){
        return super.getPotencia();
    }
    public float getPotenciaContrada(){
        return potenciaContratada;
    }
    
    public float getTarifario1(){
        return tarifario1;
    }
    
    public float getTarifario2(){
        return tarifario2;
    }
    
    public void setTarifario1(float tarifario){
        tarifario1=tarifario;
    }
    public void setPotenciaContrada(float potencia){
        potenciaContratada=potencia;
    }
    @Override
    public void setPotencia(float potencia){
        super.setPotencia(potencia);
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nO custo da Eletricidade é de:"+calculoCustoConsumo()+"€";
    }
    
    @Override
    public float calculoCustoConsumo(){
        if(super.getPotencia()<potenciaContratada){
            return super.getConsumo()*tarifario1;
        }else{
            return super.getConsumo()*tarifario2;
        }
    }
}
