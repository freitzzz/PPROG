/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl3.pprog;

import java.util.Calendar;

/**
 *
 * @author joaom
 */
public class Tempo {
    /**
     * Variavel de instancia relativamente às horas.
     */
    private int horas;
    /**
     * Variavel de instancia relativamente aos minutos.
     */
    private int minutos;
    /**
     * Variavel de instancia relativamente aos segundos.
     */
    private int segundos;
    /**
     * Constante relativamente à variavel horas.
     */
    private static final int HORAS_INDEFENIDAS=0;
    /**
     * Constante relativamente à variavel minutos.
     */
    private static final int MINUTOS_INDEFENIDOS=0;
    /**
     * Constante relativamente à variavel segundos.
     */
    private static final int SEGUNDOS_INDEFENIDOS=0;
    /**
     * Constroi uma instancia de Tempo sem tempo definido por parametros.
     */
    public Tempo(){
        this.horas=HORAS_INDEFENIDAS;
        this.minutos=MINUTOS_INDEFENIDOS;
        this.segundos=SEGUNDOS_INDEFENIDOS;
    }
    /**
     * Constroi um instancia de Tempo com tempo definido por parametros.
     * @param horas Horas definidas pelo utilizador.
     * @param minutos Minutos definidos pelo utilizador.
     * @param segundos Segundos definidos pelo utilizador.
     */
    public Tempo(int horas,int minutos,int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }
    /**
     * Método que fornece os valores da variavel de instancia horas.
     * @return As horas do objeto Tempo.
     */
    public int getHoras(){
        return this.horas;
    }
    /**
     * Método que fornece os valores da variavel de instancia minutos.
     * @return Os minutos do objeto Tempo.
     */
    public int getMinutos(){
        return this.minutos;
    }
    /**
     * Método que fornece os valores da variavel de instancia segundos.
     * @return Os segundos do objeto Tempo.
     */
    public int getSegundos(){
        return this.segundos;
    }
    /**
     * Método que declara novos valores para a variavel de instancia horas definidos por parametros.
     * @param horas O novo valor para as horas.
     */
    public void setHoras(int horas){
        this.horas=horas;
    }
    /**
     * Método que declara novos valores para a variavel de instancia minutos definidos por parametros.
     * @param minutos O novo valor para os minutos.
     */
    public void setMinutos(int minutos){
        this.minutos=minutos;
    }
    /**
     * Método que declara novos valores para a variavel de instancia segundos definidos por parametros.
     * @param segundos O novo valor para os segundos.
     */
    public void setSegundos(int segundos){
        this.segundos=segundos;
    }
    @Override
    /**
     * Método que retorna uma String com o respetivo tempo defenido em hh/mm/ss.
     * @Override Substitui a função toString() pré-definida pelo compilador.
     * @return Retorna o tempo no formato hh/mm/ss.
     */
    public String toString(){
        return "A hora atual é: "+horas+":"+minutos+":"+segundos;
    }
    /**
     * Método que adiciona um segundo ao tempo.
     */
    public void tick(){
        if(segundos<59){
            segundos++;
        }else{
            segundos=0;
            minutos++;
        }
        if(minutos==60){
            minutos=0;
            horas++;
        }
        if(horas==24){
            horas=0;
        }
    }
    /**
     * Método que retorna uma String com o tempo defenido em horario internacional (AM/PM).
     * @return Retorna o tempo em AM/PM.
     */
    public String toMostrar(){
        if(horas<12){
            return horas+":"+minutos+":"+segundos+" AM";
        }else{
            return horas-12+":"+minutos+":"+segundos+" PM";
        }
    }
    /**
     * Método que compara dois tempos de instancia Tempo.
     * @param tempo Instancia de um objeto Tempo.
     * @return Retorna qual dos dois tempos é maior.
     */
    public String toCompararString(Tempo tempo){
        if(this.horas<tempo.horas){
            return tempo.horas+":"+tempo.minutos+":"+tempo.segundos+" é maior que "+this.horas+":"+this.minutos+":"+this.segundos;
        }else{
            if(this.horas>tempo.horas){
                return this.horas+":"+this.minutos+":"+this.segundos+" é maior que "+tempo.horas+":"+tempo.minutos+":"+tempo.segundos;
            }else{
                    if(this.minutos<tempo.minutos){
                        return tempo.horas+":"+tempo.minutos+":"+tempo.segundos+" é maior que "+this.horas+":"+this.minutos+":"+this.segundos;
                    }else{
                        if(this.minutos>tempo.minutos){
                            return this.horas+":"+this.minutos+":"+this.segundos+" é maior que "+tempo.horas+":"+tempo.minutos+":"+tempo.segundos;
                        }else{
                                if(this.segundos<tempo.segundos){
                                    return tempo.horas+":"+tempo.minutos+":"+tempo.segundos+" é maior que "+this.horas+":"+this.minutos+":"+this.segundos;
                                }else{
                                    if(this.segundos>tempo.segundos){
                                        return this.horas+":"+this.minutos+":"+this.segundos+" é maior que "+tempo.horas+":"+tempo.minutos+":"+tempo.segundos;
                                    }else{
                                        return tempo.horas+":"+tempo.minutos+":"+tempo.segundos+" e "+this.horas+":"+this.minutos+":"+this.segundos+" são iguais";
                                    }
                                }
                            }
                        }
                    }
                }
            }
    /**
     * Método que compara o tempo da instancia do objeto com o tempo definido por parâmetros.
     * @param horas Variável de comparação relativamente às horas.
     * @param minutos Variável de comparação relativamente aos minutos.
     * @param segundos Variável de comparação relativamente aos segundos.
     * @return Retorna qual dos dois tempos é o maior.
     */
    public String toCompararString(int horas,int minutos,int segundos){
        if(this.horas<horas){
            return horas+":"+minutos+":"+segundos+" é maior que "+this.horas+":"+this.minutos+":"+this.segundos;
        }else{
            if(this.horas>horas){
                return this.horas+":"+this.minutos+":"+this.segundos+" é maior que "+horas+":"+minutos+":"+segundos;
            }else{
                    if(this.minutos<minutos){
                        return horas+":"+minutos+":"+segundos+" é maior que "+this.horas+":"+this.minutos+":"+this.segundos;
                    }else{
                        if(this.minutos>minutos){
                            return this.horas+":"+this.minutos+":"+this.segundos+" é maior que "+horas+":"+minutos+":"+segundos;
                        }else{
                                if(this.segundos<segundos){
                                    return horas+":"+minutos+":"+segundos+" é maior que "+this.horas+":"+this.minutos+":"+this.segundos;
                                }else{
                                    if(this.segundos>segundos){
                                        return this.horas+":"+this.minutos+":"+this.segundos+" é maior que "+horas+":"+minutos+":"+segundos;
                                    }else{
                                        return horas+":"+minutos+":"+segundos+" e "+this.horas+":"+this.minutos+":"+this.segundos+" são iguais";
                                    }
                                }
                            }
                        }
                    }
                }
            }
    /**
     * Método que compara dois tempos de instancia Tempo.
     * @param tempo Instancia de um objeto Tempo.
     * @return Retorna um booleano verdadeiro caso o tempo da instancia do objeto seja maior que o tempo da instancia definida por parâmetro.
     */
    public boolean toComparar(Tempo tempo){
        return toSegundos(tempo)>toSegundos();
    }
    /**
     * Método que compara uma instancia Tempo com um tempo definido por pârametros.
     * @param horas Variável de comparação relativamente às horas.
     * @param minutos Variável de comparação relativamente aos minutos.
     * @param segundos Variável de comparação relativamente aos segundos.
     * @return Retorna um booleano verdadeiro caso o tempo da instancia do objeto seja maior que o tempo definido por pârametros.
     */
    public boolean toComparar(int horas,int minutos,int segundos){
        return toSegundos(horas, minutos, segundos)>toSegundos();
    }
    /**
     * Método que converte um tempo em segundos.
     * @param horas Variavel relativa às horas.
     * @param minutos Variavel relativa aos minutos.
     * @param segundos Variavel relativa aos segundos.
     * @return Retorna o valor em segundos do tempo definido por parâmetros.
     */
    public int toSegundos(int horas,int minutos,int segundos){
        return ((horas*3600)+(minutos*60)+segundos);
    }
    /**
     * Método que converte o tempo da instancia de objeto em segundos.
     * @return Retorna o valor em segundos do tempo da instancia do objeto Tempo.
     */
    public int toSegundos(){
        return ((horas*3600)+(minutos*60)+segundos);
    }
    /**
     * Método que converte o tempo de uma instancia Tempo definida por parametro em segundos.
     * @param tempo Instancia de Tempo.
     * @return Retorna o valor em segundos da instancia Tempo definida por parametro.
     */
    public int toSegundos(Tempo tempo){
        return ((tempo.horas*3600)+(tempo.minutos*60)+tempo.segundos);
    }
    /**
     * Método que calcula a diferenca entre o tempo do objeto e os segundos definidos por parametro.
     * @param segundos Valor dos segundos que vão ser diferenciados.
     * @return Retorna o valor em segundos da diferencia entre o tempo do objeto e os segundos definidos por parametro.
     */
    public int diferencaTempos(int segundos){
        return Math.abs(toSegundos()-segundos);
    }
    /**
     * Método que calcula a diferenca entre o tempo do objeto e tempo da instancia Tempo definida por parametro.
     * @param tempo Instancia Tempo.
     * @return Retorna o valor em segundos da diferenca entre o tempo do objeto e a instancia Tempo definida por parametro.
     */
    public int diferencaTempos(Tempo tempo){
        return Math.abs(toSegundos(tempo.horas,tempo.minutos,tempo.segundos)-toSegundos());
    }
}