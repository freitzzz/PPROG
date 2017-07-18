package model;

public class Jogador implements Comparable<Jogador> {
    
    private String nome;
    private PosicaoJogador posicao;  

    public Jogador(String nome, PosicaoJogador posicao) {
        setNome(nome) ;
        setPosicao(posicao);
    }

    public String getNome() {
        return nome;
    }

    public PosicaoJogador getPosicao() {
        return posicao;
    }

    public final void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é inválido!");
        }
        this.nome = nome;
    }

    public final void setPosicao(PosicaoJogador posicao) {
        if (posicao == null) {
            throw new IllegalArgumentException("Posição é inválida!");
        }
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return nome + " (" + posicao + ")";
    }
    
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        Jogador outroJogador = (Jogador) outroObjeto;
        
        return nome.equalsIgnoreCase(outroJogador.nome)
                && posicao.equals(outroJogador.posicao);
    }    

    @Override
    public int compareTo(Jogador outroJogador) {
        return posicao.compareTo(outroJogador.posicao);
    }
    
}
