/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl11.pprog;

/**
 *
 * @author joaom
 */
import utilitarios.Data;
import utilitarios.Tempo;
public class Empregado {
    //Atributos
    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;
    
    //Variaveis estaticas
    private static int diasTrabalho=5;
    
    //Constantes
    private static final String PRIMEIRO_NOME_OMISSAO="N/D";
    private static final String ULTIMO_NOME_OMISSAO="N/D";
    
    //Construtores
    
    public Empregado(String primeiroNome,String ultimoNome,Data dataContrato,Tempo horaEntrada,Tempo horaSaida){
        this.primeiroNome=primeiroNome;
        this.ultimoNome=ultimoNome;
        this.dataContrato=new Data(dataContrato);
        this.horaEntrada=new Tempo(horaEntrada);
        this.horaSaida=new Tempo(horaSaida);
    }
    public Empregado(){
        primeiroNome=PRIMEIRO_NOME_OMISSAO;
        ultimoNome=ULTIMO_NOME_OMISSAO;
        dataContrato=new Data();
        horaEntrada=new Tempo();
        horaSaida=new Tempo();
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Data getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = new Data(dataContrato);
    }

    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = new Tempo(horaEntrada);
    }

    public Tempo getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = new Tempo(horaSaida);
    }
    
    public int horasTrabalhoSemanal(){
        return (horaSaida.getHoras()-horaEntrada.getHoras())*diasTrabalho;
    }
    
    public int tempoContratado(){
        return Data.dataAtual().diferenca(dataContrato);
    }
    
    @Override
    public String toString(){
        return "Empregado\nNome:"+(primeiroNome+" "+ultimoNome)+"\nData de contrato:"+dataContrato+"\nHora de entrada:"+horaEntrada+"\nHora de saida:"+horaSaida+"\nNº horas de trabalho por semana:"+horasTrabalhoSemanal()+"\nDias contratados:"+tempoContratado();
    }
}
