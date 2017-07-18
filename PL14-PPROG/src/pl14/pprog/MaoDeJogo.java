package pl14.pprog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Representa uma mão de jogo.
 *
 * @author ISEP-DEI-PPROG
 */
public class MaoDeJogo {

     /**
     * A mão de jogo.
     */
    private List<Carta> maoDeJogo;
    
    /**
     * Constrói uma instância de {@code MaoDeJogo} recebendo um conjunto de
     * cartas.
     * 
     * @param mao o conjunto de cartas.
     */
    public MaoDeJogo(List<Carta> mao) {
        maoDeJogo = new ArrayList(mao);
    }

    /**
     * Constrói uma instância de {@code MaoDeJogo} vazia, ou seja, sem cartas.
     */
    public MaoDeJogo() {
        maoDeJogo = new ArrayList<>();
    }
    
    /**
     * Constrói uma instância de {@code MaoDeJogo} com as mesmas caraterísticas
     * da mão de jogo recebida por parâmetro.
     * 
     * @param outraMaoDeJogo a mão de jogo com as caraterísticas a copiar.
     */
    public MaoDeJogo(MaoDeJogo outraMaoDeJogo) {
        for(Carta c : outraMaoDeJogo.maoDeJogo) {
            maoDeJogo.add(new Carta(c));
        }
    }

    /**
     * Devolve a descrição textual da mão de jogo (uma carta por linha).
     * 
     * @return caraterísticas das cartas da mão de jogo.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Carta c : maoDeJogo) {
            s.append(c.toString());
            s.append("\n");
        }
        return s.toString();
    }

    /**
     * Devolve um conjunto com os vários tipos de carta (duque, terno, etc.)
     * existentes na mão de jogo.
     * 
     * @return {@code List} com os tipos de carta existentes na mão de jogo.
     */
    public List<Carta.Tipo> tiposDeCarta() {
        List<Carta.Tipo>cartasTipo=new ArrayList<>();
        for(int i=0;i<maoDeJogo.size();i++){
            Carta cartasEmJogo=maoDeJogo.get(i);
            if(cartasEmJogo.getTipo().equals(Carta.Tipo.Terno)||cartasEmJogo.getTipo().equals(Carta.Tipo.Sena)||cartasEmJogo.getTipo().equals(Carta.Tipo.Valete)||cartasEmJogo.getTipo().equals(Carta.Tipo.As)||cartasEmJogo.getTipo().equals(Carta.Tipo.Duque)||cartasEmJogo.getTipo().equals(Carta.Tipo.Manilha)){
                cartasTipo.add(cartasEmJogo.getTipo());
            }
        }
        return cartasTipo;
    }

    /**
     * Determina quantas cartas de um dado tipo existem na mão de jogo.
     * 
     * @param tipo o tipo de carta.
     * @return quantidade de cartas do tipo, que existem na mão de jogo.
     */
    public int contarCartasDoTipo(Carta.Tipo tipo) {
        int contagemCartas=0;
        for(int i=0;i<maoDeJogo.size();i++){
            Carta cartasEmJogo=maoDeJogo.get(i);
            if(cartasEmJogo.getTipo().equals(tipo)){
                contagemCartas++;
            }
        }
        return contagemCartas;
    }

    /**
     * Ordena a mão de jogo por naipe e, dentro do mesmo naipe, ordena por tipo.
     */
    public void ordenar(){
        // A classe Carta deve implementar a interface Comparable, devendo
        // implementar especificamente Comparable<Carta>
//        Comparator<Carta> c=new Comparator<Carta>() {
//            @Override
//            public int compare(Carta t, Carta t1) {
//                return t.getTipo().compareTo(t1.getTipo());
//            }
//        };
        Collections.sort(maoDeJogo);
        //Collections.sort(maoDeJogo,c);
    }

}
