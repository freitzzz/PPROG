package pl16.pprog.GUI;

import java.awt.*;
import javax.swing.*;

/**
 * Representa uma janela cujo ContentPane tem um gestor de posicionamento 
 * BorderLayout.
 * 
 * @author ISEP-DEI-PPROG
 */
public class JanelaBorderLayout extends JFrame {
    
    /**
     * A largura da janela em píxeis.
     */
    private static final int JANELA_LARGURA = 400;
    
    /**
     * A altura da janela em píxeis.
     */
    private static final int JANELA_ALTURA = 200;    
    
    
    /**
     * Constrói uma instância de JanelaBorderLayout.
     * 
     * @param titulo o título da janela
     */    
    public JanelaBorderLayout(String titulo) {

        super(titulo);

        getContentPane().setBackground(Color.CYAN);

        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        
        criarComponentes();
        //Alterar posição dos componentes na horizontal
        bl.setHgap(20);
        //Alterar posição dos componentes na vertical
        bl.setVgap(20);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(JANELA_LARGURA, JANELA_ALTURA);
        setVisible(true);
    }
    
    
    /**
     * Cria e adiciona componentes à janela.
     */
    private void criarComponentes(){
        
        String[] titulos = {"Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete"};
        
        add(criarPainelNorte(),BorderLayout.NORTH);
        add(criarPainel("Quatro",Color.BLUE),BorderLayout.WEST);
        add(criarPainel("Cinco",Color.RED),BorderLayout.CENTER);
        add(criarPainel("Seis",Color.BLUE),BorderLayout.EAST);
        add(criarPainel("SETE",Color.YELLOW),BorderLayout.SOUTH);       
    }
    private JPanel criarPainelNorte(){
        JPanel p=new JPanel();
        p.setBackground(Color.YELLOW);
        p.add(new JButton("Um"));
        p.add(new JButton("Dois"));
        p.add(new JButton("Três"));
        return p;
    }
    private JPanel criarPainel(String num,Color color){
        JPanel p=new JPanel();
        p.setBackground(color);
        p.add(new JButton(num));
        return p;
    }
    /**
     * Para testar a janela JanelaBorderLayout.
     * 
     * @param args as opções de execução
     */
    public static void main(String [] args) {

        JanelaBorderLayout janela = new JanelaBorderLayout("Gestor de Posicionamento: BorderLayout");
        
    }
}
