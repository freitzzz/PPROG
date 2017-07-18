package ui;

import model.Jogador;
import model.ListaJogadores;
import javax.swing.AbstractListModel;

public class ModeloListaJogadores extends AbstractListModel {

    private ListaJogadores listaJogadores;
    
    public ModeloListaJogadores(ListaJogadores listaJogadores) {
        this.listaJogadores = listaJogadores;
    }

    @Override
    public int getSize() {
        return listaJogadores.tamanho();
    }

    @Override
    public Object getElementAt(int indice) {
        return listaJogadores.obterJogador(indice);
    }
    
    public boolean addElement(Jogador jogador){
        boolean jogadorAdicionado = listaJogadores.adicionarJogador(jogador);
        if(jogadorAdicionado)
            fireIntervalAdded(this, getSize()-1, getSize()-1);
        return jogadorAdicionado;
    } 

    public boolean removeElement(Jogador jogador){
        int indice = listaJogadores.indiceDe(jogador);
        boolean jogadorRemovido = listaJogadores.removerJogador(jogador);
        if(jogadorRemovido)
            fireIntervalRemoved(this, indice, indice);
        return jogadorRemovido;
    }
    
    public boolean contains(Jogador jogador){
        return listaJogadores.contem(jogador);
    }
    
    public void sort(){
        listaJogadores.ordenarPorPosicao();
    }

}
