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
public class Professor extends Pessoa implements Pagavel{
    private String categoria;
    
    private static String adjunto="Adjunto";
    private static String coordenador="Coordenador";
    private static float assistenteBase=0;
    private static float adjuntoBase=0.2f;
    private static float coordenadorBase=0.5f;
    private static float salarioBase=1500f;
    private static final String CATEGORIA_OMISSAO="Assistente";
    
    public Professor(String nome,String categoria){
        super(nome);
        this.categoria=categoria;
    }
    public Professor(){
        super();
        categoria=CATEGORIA_OMISSAO;
    }
    
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public void setAdjunto(String categoria){
        adjunto=categoria;
    }
    public void setCoordenador(String categoria){
        coordenador=categoria;
    }
    public void setAssistenteBase(float base){
        assistenteBase=base;
    }
    public void setAdjuntoBase(float base){
        adjuntoBase=base;
    }
    public void setCoordenadorBase(float base){
        coordenadorBase=base;
    }
    public void setSalarioBase(float base){
        salarioBase=base;
    }
    
    public String getCategoria(){
        return categoria;
    }
    public String getAdjunto(){
        return adjunto;
    }
    public String getCoordenador(){
        return coordenador;
    }
    public float getAssistenteBase(){
        return assistenteBase;
    }
    public float getAdjuntoBase(){
        return adjuntoBase;
    }
    public float getCoordenadorBase(){
        return coordenadorBase;
    }
    public float getSalarioBase(){
        return salarioBase;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nCategoria: "+categoria+"\nVencimento: "+calcularVencimento()+"€";
    }
    private float calcularVencimento(){
        if(categoria.equals(coordenador)){
            return (salarioBase)+(salarioBase*coordenadorBase);
        }else if(categoria.equals(adjunto)){
            return (salarioBase)+(salarioBase*adjuntoBase);
        }else{
            return salarioBase;
        }
    }
    
    @Override
    public float calcularGasto() {
        return calcularVencimento();
    }
}
