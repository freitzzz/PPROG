package exemploseventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Representa uma janela contendo três labels: - uma label com texto e que faz
 * surgir, após um clique nela, uma caixa de diálogo mostrando o seu texto; -
 * uma label inicializada com um ícone e um texto que muda de cor à passagem do
 * rato; - uma label com texto e ícone adicionados depois da criação da label.
 *
 * @author ISEP-DEI-PPROG
 */
public class JanelaEventosLabel extends JFrame {

    /**
     * A largura da janela em píxeis.
     */
    private static final int JANELA_LARGURA = 420;

    /**
     * A altura da janela em píxeis.
     */
    private static final int JANELA_ALTURA = 200;

    /**
     * Constrói uma instância de JanelaEventosLabel.
     */
    public JanelaEventosLabel() {

        super("Teste de Labels");

        setLayout(new FlowLayout());

        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(JANELA_LARGURA, JANELA_ALTURA);
        setVisible(true);

    }

    /**
     * Cria e adiciona os componentes gráficos ao painél de conteudos da
     * JanelaEventosLabel
     */
    private void criarComponentes() {
        JLabel lbl1 = criarLabelComTexto();

        Icon icone = new ImageIcon(getClass().getResource("/imagens/bullet.gif"));
        JLabel lbl2 = criarLabelComTextoEImagem1(icone);
        JLabel lbl3 = criarLabelComTextoEImagem2(icone);

        add(lbl1);
        add(lbl2);
        add(lbl3);
    }

    /**
     * Cria e devolve uma label com texto. Um clique nesta label faz surgir uma
     * caixa de diálogo mostrando o seu texto.
     */
    private JLabel criarLabelComTexto() {
        JLabel lbl1 = new JLabel("TEXTO");
        lbl1.setToolTipText("Label 1");

        /* 
         * Regista uma classe interna anónima destinada a executar o  
         * método de evento após a ocorrência de um clique do rato na label 
         * lbl1.  
         */
        lbl1.addMouseListener(new MouseAdapter() {
            /**
             * Método de evento do tipo Mouse gerado por uma label, após um
             * clique do rato sobre ela. Este método mostra uma mensagem ao
             * utilizador informando a label indicada.
             *
             * @param e o objeto de evento do tipo Mouse gerado por uma label
             * após um clique do rato sobre ela
             */
            @Override
            public void mouseClicked(MouseEvent e) {

                String texto = "Clicou na label com texto: ";
                texto += ((JLabel) e.getSource()).getText();
                JOptionPane.showMessageDialog(JanelaEventosLabel.this, texto);

            }
        });

        lbl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return lbl1;
    }

    /**
     * Cria e devolve uma label com ícone e texto, sendo este alinhado à
     * direita. Um clique nesta label faz surgir uma caixa de diálogo que mostra
     * o seu texto.
     */
    private JLabel criarLabelComTextoEImagem1(Icon icone) {
        JLabel lbl2 = new JLabel("TEXTO e ÍCONE", icone, JLabel.RIGHT);
        lbl2.setForeground(Color.BLUE);
        lbl2.setFont(new Font("TimesRoman", Font.BOLD, 20));
        lbl2.setToolTipText("Label 2");
        lbl2.setPreferredSize(new Dimension(200, 100));

        /* 
         * Regista uma classe interna anónima destinada a executar o  
         * método de evento após a entrada/saída do rato na label lbl2.
         */
        lbl2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JLabel) e.getSource()).setForeground(Color.WHITE);
            }

            /**
             * Método de evento do tipo Mouse gerado por uma label quando o rato
             * sai dessa label. Este método muda a cor da label para encarnado.
             *
             * @param e o objeto de evento do tipo Mouse gerado por uma label
             * quando o rato sai dessa label
             */
            @Override
            public void mouseExited(MouseEvent e) {
                ((JLabel) e.getSource()).setForeground(Color.BLUE);
            }
        });

        lbl2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        return lbl2;
    }

    /**
     * Cria e devolve uma label vazia e, posteriormente, é adicionado um texto e
     * um ícone.
     */
    private JLabel criarLabelComTextoEImagem2(Icon icone) {
        JLabel lbl3 = new JLabel();
        lbl3.setText("TEXTO e ÍCONE no FIM");
        lbl3.setIcon(icone);
        lbl3.setHorizontalTextPosition(JLabel.LEFT);
        lbl3.setVerticalTextPosition(JLabel.BOTTOM);
        lbl3.setToolTipText("Label 3");

        lbl3.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        return lbl3;
    }

    public static void main(String[] args) {

        JanelaEventosLabel janela = new JanelaEventosLabel();

    }
}
