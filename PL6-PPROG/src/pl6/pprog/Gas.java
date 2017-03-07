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
public class Gas extends Contador {
    
    private static float custoM3=0.8f;
    private static int totalContadoresGas=1;
    
    private static final String REFERENCIA="Gás-";
    
    public Gas(String nome,int consumo){
        super(nome,consumo,REFERENCIA+totalContadoresGas++);
    }
    
    public Gas(String nome){
        super(nome,REFERENCIA+totalContadoresGas++);
    }
    public Gas(int consumo){
        super(REFERENCIA+totalContadoresGas++,consumo);
    }
    
    public float getCustoM3(){
        return custoM3;
    }
    
    public void setCustoM3(float custo){
        custoM3=custo;
    }
    
    
    @Override
    public String toString(){
        return  super.toString()+"\nTotal a pagar:"+calculoCustoConsumo()+"€";
    }
    
    
    public float calculoCustoConsumo(){
        return custoM3*super.getConsumo();
    }
}
