package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.ListDataEvent;
//import javax.swing.event.ListDataListener;

public class Janela extends JFrame {

    private JList lstCompleta, lstConvocados;
    private JButton btnEliminarCompleta, btnEliminarConvocados;
    private JButton btnConvocar, btnCriarFicheiro;
    private JMenuItem menuItemGuardar;

    public Janela() {

        super("Jogadores Convocados");

        criarComponentes();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setMinimumSize(new Dimension(getWidth(), getHeight()));
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public JList getLstCompleta() {
        return lstCompleta;
    }

    private void criarComponentes() {
        JMenuBar menuBar = criarBarraMenus();
        setJMenuBar(menuBar);

        JPanel p = criarPainelListas();
        add(p, BorderLayout.CENTER);
    }

    private JMenuBar criarBarraMenus() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu = criarMenu();
        menuBar.add(menu);
        
        return menuBar;
    }    

    private JMenu criarMenu() {
        JMenu menu = new JMenu("Menu");
        menu.setMnemonic(KeyEvent.VK_M);

        menu.add(criarItemNovoJogador());

        menu.addSeparator();

        menuItemGuardar = criarItemGuardar();
        menu.add(menuItemGuardar);

        menu.addSeparator();

        menu.add(criarItemSair());

        return menu;
    }

    private JMenuItem criarItemNovoJogador() {
        JMenuItem item = new JMenuItem("Novo Jogador", 'N');
        item.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
        JDialog caixaTexto=new JDialogNovoJogador(this);
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                caixaTexto.setVisible(true);
            }
        });
        return item;
    }

    private JMenuItem criarItemGuardar() {
        JMenuItem item = new JMenuItem("Guardar Listas", 'G');
        item.setAccelerator(KeyStroke.getKeyStroke("ctrl G"));
        return item;
    }

    private JMenuItem criarItemSair() {
        JMenuItem item = new JMenuItem("Sair", 'S');
        item.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
        return item;
    }

    private JPanel criarPainelListas() {
        final int NUMERO_LINHAS = 1, NUMERO_COLUNAS = 2;
        final int INTERVALO_HORIZONTAL = 20, INTERVALO_VERTICAL = 0;
        JPanel p = new JPanel(new GridLayout( NUMERO_LINHAS, 
                                              NUMERO_COLUNAS, 
                                              INTERVALO_HORIZONTAL,
                                              INTERVALO_VERTICAL));
        
        lstCompleta = new JList();
        btnEliminarCompleta = criarBotaoEliminarJogador(lstCompleta);
        btnConvocar = criarBotaoConvocarJogador();
        p.add(criarPainelLista( "Lista de Jogadores Completa:",
                                lstCompleta,
                                null,
                                btnEliminarCompleta,
                                btnConvocar));
        
        lstConvocados = new JList();
        btnEliminarConvocados = criarBotaoEliminarJogador(lstConvocados);
        btnCriarFicheiro = criarBotaoCriarFicheiro();
        p.add(criarPainelLista( "Lista de Jogadores Convocados:",
                                lstConvocados,
                                null,
                                btnEliminarConvocados,
                                btnCriarFicheiro));
        return p;
    }

    private JPanel criarPainelLista(
            String tituloLista,
            JList lstLista,
            ModeloListaJogadores modeloLista,
            JButton btnSuperior,
            JButton btnInferior) {
        JLabel lblTitulo = new JLabel(tituloLista, JLabel.LEFT);

//        modeloLista.addListDataListener(new ListDataListener() {
//            @Override
//            public void intervalAdded(ListDataEvent e) {
//            }
//
//            @Override
//            public void intervalRemoved(ListDataEvent e) {
//            }
//
//            @Override
//            public void contentsChanged(ListDataEvent e) {
//            }
//        });
        
        lstLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrPane = new JScrollPane(lstLista);

        JPanel p = new JPanel(new BorderLayout());
        
        final int MARGEM_SUPERIOR = 20, MARGEM_INFERIOR = 20;
        final int MARGEM_ESQUERDA = 20, MARGEM_DIREITA = 20;
        p.setBorder(BorderFactory.createEmptyBorder( MARGEM_SUPERIOR, 
                                                     MARGEM_ESQUERDA,
                                                     MARGEM_INFERIOR, 
                                                     MARGEM_DIREITA));
        
        p.add(lblTitulo, BorderLayout.NORTH);
        p.add(scrPane, BorderLayout.CENTER);

        JPanel pBotoes = criarPainelBotoes(btnSuperior, btnInferior);
        p.add(pBotoes, BorderLayout.SOUTH);
        return p;
    }

    private JPanel criarPainelBotoes(JButton btn1, JButton btn2) {

        final int NUMERO_LINHAS = 2, NUMERO_COLUNAS = 1;
        final int INTERVALO_HORIZONTAL = 0, INTERVALO_VERTICAL = 10;        
        JPanel p = new JPanel(new GridLayout( NUMERO_LINHAS, 
                                              NUMERO_COLUNAS, 
                                              INTERVALO_HORIZONTAL,
                                              INTERVALO_VERTICAL));
        
        final int MARGEM_SUPERIOR = 10, MARGEM_INFERIOR = 0;
        final int MARGEM_ESQUERDA = 0, MARGEM_DIREITA = 0;
        p.setBorder(BorderFactory.createEmptyBorder( MARGEM_SUPERIOR, 
                                                     MARGEM_ESQUERDA,
                                                     MARGEM_INFERIOR, 
                                                     MARGEM_DIREITA));
        
        p.add(btn1);
        p.add(btn2);
        
        return p;
    }

    private JButton criarBotaoEliminarJogador(JList lstLista) {
        JButton btn = new JButton("Eliminar Jogador");
        return btn;
    }

    private JButton criarBotaoConvocarJogador() {
        btnConvocar = new JButton("Convocar Jogador");
        return btnConvocar;
    }

    private JButton criarBotaoCriarFicheiro() {
        btnCriarFicheiro = new JButton("Criar Ficheiro Convocados");
        return btnCriarFicheiro;
    }
}
