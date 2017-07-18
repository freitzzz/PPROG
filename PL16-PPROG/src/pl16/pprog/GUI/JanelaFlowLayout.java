package pl16.pprog.GUI;

import java.awt.*;
import javax.swing.*;

/**
 * Representa uma janela cujo ContentPane tem um gestor de posicionamento 
 * FlowLayout.
 * 
 * @author ISEP-DEI-PPROG
 */
public class JanelaFlowLayout extends JFrame {

    /**
     * A largura da janela em píxeis.
     */
    private static final int JANELA_LARGURA = 400;

    /**
     * A altura da janela em píxeis.
     */
    private static final int JANELA_ALTURA = 200;

    /**
     * Constrói uma instância de JanelaFlowLayout.
     *
     * @param titulo o título da janela
     */
    public JanelaFlowLayout(String titulo) {
        super(titulo);

        getContentPane().setBackground(Color.CYAN);

        FlowLayout fl = new FlowLayout();
        setLayout(fl);

        criarComponentes();
        //Alterar espacamento horizontal dos componentes
        fl.setHgap(20);
        //Alterar espacamento vertical dos componentes
        fl.setVgap(30);
        //Alterar posicionamento dos componentes para a esquerda
        fl.setAlignment(0);
        //Altera posicionamento dos compontentes para a direita
        fl.setAlignment(1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(JANELA_LARGURA, JANELA_ALTURA);
        setVisible(true);
    }

    /**
     * Cria e adiciona componentes à janela.
     */
    private void criarComponentes() {
        
        String[] titulos = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete"};
        //Coloque todos os botões com a dimensão (75,30)
        for (String titulo : titulos) {
            JButton jb=new JButton(titulo);
            Dimension dimensao=new Dimension(75,30);
            jb.setPreferredSize(dimensao);
            add(jb);
        }
    }

    /**
     * Para testar a janela JanelaFlowLayout.
     *
     * @param args as opções de execução
     */
    public static void main(String[] args) {

        JanelaFlowLayout janela = new JanelaFlowLayout("Gestor de Posicionamento: FlowLayout");
        
    }
}

