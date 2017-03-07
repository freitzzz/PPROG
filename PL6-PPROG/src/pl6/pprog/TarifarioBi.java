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
public class TarifarioBi extends Eletricidade{
   private int horasVazio;
   private int horasForaVazio;
   private static float custoHorasVazio=0.066f;
   private static float custoHorasForaVazio=0.14f;
   private static final int HORAS_VAZIO_OMISSAO=0;
   private static final int HORAS_FORA_VAZIO_OMISSAO=0;
   
   public TarifarioBi(String nome,int consumo,float potencia,int horasVazio,int horasForaVazio){
        super(nome,consumo,potencia);
        this.horasVazio=horasVazio;
        this.horasForaVazio=horasForaVazio;
    }
   public TarifarioBi(String nome,int consumo,float potencia,int horasVazio){
       super(nome,consumo,potencia);
       this.horasVazio=horasVazio;
       this.horasForaVazio=HORAS_FORA_VAZIO_OMISSAO;
   }
   public TarifarioBi(String nome,int consumo,int horasForaVazio,float potencia){
       super(nome,consumo,potencia);
       this.horasForaVazio=horasForaVazio;
       this.horasVazio=HORAS_VAZIO_OMISSAO;
   }
    public TarifarioBi(String nome,float potencia,int horasVazio,int horasForaVazio){
        super(nome,potencia);
        this.horasVazio=horasVazio;
        this.horasForaVazio=horasForaVazio;
    }
    public TarifarioBi(String nome,float potencia,int horasVazio){
        super(nome,potencia);
        this.horasVazio=horasVazio;
        horasForaVazio=HORAS_FORA_VAZIO_OMISSAO;
    }
    public TarifarioBi(String nome,int horasForaVazio,float potencia){
        super(nome,potencia);
        this.horasForaVazio=horasForaVazio;
        horasVazio=HORAS_VAZIO_OMISSAO;
    }
    public TarifarioBi(int consumo,float potencia,int horasVazio,int horasForaVazio){
        super(consumo,potencia);
        this.horasVazio=horasVazio;
        this.horasForaVazio=horasForaVazio;
    }
    public TarifarioBi(int consumo,float potencia,int horasVazio){
        super(consumo,potencia);
        this.horasVazio=horasVazio;
        horasForaVazio=HORAS_FORA_VAZIO_OMISSAO;
    }
    public TarifarioBi(int consumo,int horasForaVazio,float potencia){
        super(consumo,potencia);
        this.horasForaVazio=horasForaVazio;
        horasVazio=HORAS_VAZIO_OMISSAO;
    }
    public TarifarioBi(String nome,int consumo,int horasVazio,int horasForaVazio){
        super(nome,consumo);
        this.horasVazio=horasVazio;
        this.horasForaVazio=horasForaVazio;
    }
    public TarifarioBi(String nome,int consumo,int horasVazio){
        super(nome,consumo);
        this.horasVazio=horasVazio;
        horasForaVazio=HORAS_FORA_VAZIO_OMISSAO;
    }
    public TarifarioBi(int consumo,String nome,int horasForaVazio){
        super(nome,consumo);
        this.horasForaVazio=horasForaVazio;
        horasVazio=HORAS_VAZIO_OMISSAO;
    }
    public TarifarioBi(int horasVazio,int horasForaVazio,String nome){
        super(nome);
        this.horasVazio=horasVazio;
        this.horasForaVazio=horasForaVazio;
    }
    public TarifarioBi(int horasVazio,String nome){
        super(nome);
        this.horasVazio=horasVazio;
        horasForaVazio=HORAS_FORA_VAZIO_OMISSAO;
    }
    public TarifarioBi(String nome,int horasForaVazio){
        super(nome);
        this.horasForaVazio=horasForaVazio;
        horasVazio=HORAS_VAZIO_OMISSAO;
    }
    public TarifarioBi(int consumo,int horasVazio,int horasForaVazio){
        super(consumo);
        this.horasVazio=horasVazio;
        this.horasForaVazio=horasForaVazio;
    }
    public TarifarioBi(int consumo,int horasVazio){
        super(consumo);
        this.horasVazio=horasVazio;
        horasForaVazio=HORAS_FORA_VAZIO_OMISSAO;
    }
    
    
    public float getCustoHorasVazio(){
        return custoHorasVazio;
    }
    public float getCustoHorasForaVazio(){
        return custoHorasForaVazio;
    }
    
    @Override
    public float getPotencia(){
        return super.getPotencia();
    }
    
    public void setCustoHorasVazio(float horas){
        custoHorasVazio=horas;
    }
    public void setCustoHorasForaVazio(float horas){
        custoHorasForaVazio=horas;
    }
    
    @Override
    public void setPotencia(float potencia){
        super.setPotencia(potencia);
    }
    @Override
    public String toString(){
        return super.toString()+"\nO custo da eletricidade é:"+calculoCustoConsumo()+"€";
    }
    
    
    @Override
    public float calculoCustoConsumo() {
        return (horasVazio*custoHorasVazio)+(horasForaVazio*custoHorasForaVazio);
    }
}
