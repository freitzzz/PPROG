/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl12.pprog;

/**
 * Classe que representa uma exposição.
 * @author joaom
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exposicao implements Comparable<Exposicao>{
    //Atributos
    private String designacao;
    private int anoRealizacao;
    private List<Quadro> quadrosExibidos;
    
    //Constantes
    private static final String DESIGNACAO_OMISSAO="N/D";
    private static final int ANO_RELAIZACAO_OMISSAO=0;
    
    //Construtores
    
    public Exposicao(String designacao,int anoRealizacao,Quadro quadro,boolean partilha){
        this.designacao=designacao;
        this.anoRealizacao=anoRealizacao;
        quadrosExibidos=new ArrayList<>();
        if(partilha){
            quadrosExibidos.add(quadro);
        }else{
            quadrosExibidos.add(new Quadro(quadro));
        }
    }
    public Exposicao(){
        designacao=DESIGNACAO_OMISSAO;
        anoRealizacao=ANO_RELAIZACAO_OMISSAO;
        quadrosExibidos=new ArrayList<>();
    }
    
    //Métodos set()
    
    public void setDesignacao(String designacao){
        this.designacao=designacao;
    }
    public void setAnoRealizacao(int anoRealizacao){
        this.anoRealizacao=anoRealizacao;
    }
    
    //Métodos get()
    
    public String getDesignacao(){
        return designacao;
    }
    public int getAnoRealizacao(){
        return anoRealizacao;
    }
    public List getQuadrosExibidos(){
        return quadrosExibidos;
    }
    public String getQuadrosExibidosString(){
        String quadrosString="";
        for(int i=0;i<quadrosExibidos.size();i++){
            quadrosString+=quadrosExibidos.get(i)+"\n";
        }
        return quadrosString;
    }
    
    //Métodos add()
    
    public boolean addQuadro(Quadro quadro,boolean partilha){
        if(partilha){
            return quadrosExibidos.add(quadro);
        }else{
            return quadrosExibidos.add(new Quadro(quadro));
        }
    }
    
    //Métodos remove()
    
    public boolean removeQuadro(Quadro quadro){
        return quadrosExibidos.remove(quadro);
    }
    
    //Métodos do objeto
    
    private String quadrosOrdenados(){
        String quadrosString="";
        List<Quadro> quadros=new ArrayList<>();
        for(Quadro quadrosExibido:quadrosExibidos){
            quadros.add(quadrosExibido);
        }
        Collections.sort(quadros);
        for(int i=0;i<quadros.size();i++){
            quadrosString+=quadros.get(i).toString()+"\n";
        }
        return quadrosString;
    }
    
    @Override
    public int compareTo(Exposicao exposicao){
        if(anoRealizacao>exposicao.anoRealizacao){
            return 1;
        }else if(anoRealizacao==exposicao.anoRealizacao){
            return 0;
        }else{
            return -1;
        }
    }
    
    //Métodos internos
    
    @Override
    public String toString(){
        return "Exposição: "+designacao+"\n"
                + "Ano de Realização: "+anoRealizacao+"\n"
                + "Quadros Expostos:\n"+quadrosOrdenados();
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null||this.getClass()!=obj.getClass()){
            return false;
        }
        Exposicao obj2=(Exposicao) obj;
        if(obj2.designacao.equalsIgnoreCase(designacao)&&obj2.anoRealizacao==anoRealizacao&&obj2.quadrosExibidos.equals(quadrosExibidos)){
            return true;
        }else{
            return false;
        }
    }
}
