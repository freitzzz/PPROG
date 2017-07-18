/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl16.pprog;

/**
 *
 * @author joaom
 */
import com.sun.prism.Image;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Contador extends JFrame{
    /**
     * A largura da janela em píxeis.
     */
    private static final int JANELA_LARGURA = 300;
    /**
     * A altura da janela em píxeis.
     */
    private static final int JANELA_ALTURA = 200;
    private static final String MENSAGEM_CLICAR="Clique Aqui! ";
    private static final String MENSAGE_NUMERO_CLIQUES="Número de Cliques ";
    private int contador;
    private JLabel cliques;
    
    public Contador(String titulo){
        //Dá o titulo ao cabecalho da janela
        super(titulo);
        //Preenche a cor do fundo da janela
        //getContentPane().setBackground(Color.ORANGE);
        //Adiciona a opção de fechar o programa caso a janela se feche
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Poem a janela com o tamanho predefinido
        setSize(JANELA_LARGURA,JANELA_ALTURA);
        //Cria um layout para a janela
        BorderLayout bl=new BorderLayout();
        //Define o layout para a janela
        setLayout(bl);
        //Cria um novo JLabel
        cliques=new JLabel(MENSAGE_NUMERO_CLIQUES+contador,JLabel.CENTER);
        //Altera a fonte do JLabel
        cliques.setFont(new Font(Font.DIALOG,Font.BOLD,15));
        //Adiciona a janela o JLabel
        add(cliques,BorderLayout.CENTER);
        //Adiciona a Janela o JButton
        add(criarBotao(),BorderLayout.SOUTH);
        //Poem visivel a janela
        setVisible(true);
    }
    private JButton criarBotao(){
        JButton btn=new JButton();
        btn.setText(MENSAGEM_CLICAR);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                contador++;
                cliques.setText(MENSAGE_NUMERO_CLIQUES+contador);
            }
        });
        return btn;
    }
}
