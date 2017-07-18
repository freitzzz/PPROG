/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import model.PosicaoJogador;

/**
 *
 * @author joaom
 */
public class JDialogNovoJogador extends JDialog{
    private JComboBox jcbPosicao;
    public JDialogNovoJogador(JFrame janelaSuperior){
        super(janelaSuperior,"Novo Jogador",true);
        setLayout(new GridLayout(3,0));
        add(criarPainelNomeJogador());
        add(criarPainelPosicaoJogador());
        add(criarPainelButoes());
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pack();
    }
    private JPanel criarPainelNomeJogador(){
        JPanel jpn=new JPanel();
        JLabel jlbNome=new JLabel("Nome");
        JTextField jtfNome=new JTextField(10);
        jpn.add(jlbNome);
        jpn.add(jtfNome);
        return jpn;
    }
    private JPanel criarPainelPosicaoJogador(){
        JPanel jpn=new JPanel();
        jpn.add(new JLabel("Posição:"));
        jcbPosicao=new JComboBox(PosicaoJogador.values());
        jpn.add(jcbPosicao);
        return jpn;
    }
    private JPanel criarPainelButoes(){
        JPanel jpn=new JPanel();
        JButton btnAdicionar=new JButton("Adicionar");
        btnAdicionar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                System.out.println(jcbPosicao.getSelectedItem());
            }
        });
        jpn.add(btnAdicionar);
        return jpn;
    }
}
