package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaJogadores {

    private List<Jogador> listaJogadores;

    public ListaJogadores() {
        listaJogadores = new ArrayList<>();
    }
    
    public Jogador obterJogador(int indice) {
        return listaJogadores.get(indice);
    }

    public boolean adicionarJogador(Jogador jogador) {
        if (!listaJogadores.contains(jogador)) {
            return listaJogadores.add(jogador);
        }
        return false;
    }

    public boolean removerJogador(Jogador jogador) {
        return listaJogadores.remove(jogador);
    }

    public int tamanho() {
        return this.listaJogadores.size();
    }

    public int indiceDe(Jogador jogador) {
        return listaJogadores.indexOf(jogador);
    }
    
    public boolean contem(Jogador jogador){
        return listaJogadores.contains(jogador);
    }
    
    public void ordenarPorPosicao(){
        Collections.sort(listaJogadores);
    }
    
}
