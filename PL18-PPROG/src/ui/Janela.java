/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author joaom
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class Janela extends JFrame{
    private int quantidadeLetras;
    private JTextField quantidade;
    private GridLayout glLetras;
    private JPanel jpLetras;
    private static final String OPCAO="Opção";
    private static final String QUANTIDADE="Quantidade de Letras";
    private static final String CONFIRMAR="Confirmar";
    private static final String ERRO="Erro!";
    private static final String ERRO_QUANTIDADE="Quantidade de Letras inválida!!";
    private static final String[] LETRAS={"A","B","C","D","E","F","G"};
    private static final int MIN_LETRAS=3;
    private static final int MAX_LETRAS=7;
    private static final int LINHAS=3;
    private static final int COLUNAS=1;
    private static final int MARGENS=10;
    private static final int LARGURA_TEXT_FIELD=2;
    public Janela(String titulo){
        super(titulo);
        add(criarPainelOpcao());
        add(jpLetras=criarPainelJLabels());
        add(criarPainelShifts());
        configuracao();
    }
    //Configuração da Janela
    private void configuracao(){
        setLayout(new GridLayout(LINHAS,COLUNAS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    //Painel da opção das quantidades de letras
    private JPanel criarPainelOpcao(){
        JPanel jp=new JPanel(new FlowLayout(FlowLayout.LEFT));
        jp.add(criarPainelQuantidadeLetras());
        return jp;
    }
    private JPanel criarPainelQuantidadeLetras(){
        JPanel jp=new JPanel();
        jp.add(new JLabel(QUANTIDADE+"["+MIN_LETRAS+","+MAX_LETRAS+"]:"));
        quantidade=new JTextField(LARGURA_TEXT_FIELD);
        jp.add(quantidade);
        jp.add(criarButaoConfirmar());
        jp.setBorder(BorderFactory.createTitledBorder(OPCAO));
        return jp;
    }
    private JButton criarButaoConfirmar(){
        JButton btnConfirmar=new JButton(CONFIRMAR);
        btnConfirmar.addActionListener((ActionEvent ae) -> {
            try{
                if(Integer.parseInt(quantidade.getText())<MIN_LETRAS||Integer.parseInt(quantidade.getText())>MAX_LETRAS){
                    throw new NumberFormatException();
                }else if(Integer.parseInt(quantidade.getText())<quantidadeLetras){
                    quantidadeLetras=Integer.parseInt(quantidade.getText());
                    glLetras.setColumns(quantidadeLetras);
                    for(int i=quantidadeLetras;i<jpLetras.getComponentCount();i++){
                        jpLetras.remove(jpLetras.getComponent(i));
                    }
                    }else{
                    quantidadeLetras=Integer.parseInt(quantidade.getText());
                    glLetras.setColumns(quantidadeLetras);
                    for(int i=jpLetras.getComponentCount();i<quantidadeLetras;i++){
                        JLabel jlb=criarJLabel(LETRAS[i]);
                        jpLetras.add(jlb);
                    }
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,ERRO_QUANTIDADE,ERRO,JOptionPane.ERROR_MESSAGE);
            }
            revalidate();
        });
        return btnConfirmar;
    }
    //
    private JPanel criarPainelJLabels(){;
        JPanel jp=new JPanel(glLetras=new GridLayout(1,3));
        for(int i=0;i<MIN_LETRAS;i++){
            JLabel jlb=criarJLabel(LETRAS[i]);
            jp.add(jlb);
        }
        return jp;
    }
    private JLabel criarJLabel(String letra){
        JLabel jlbLetra=new JLabel(letra);
        jlbLetra.setFont(new Font(Font.DIALOG,Font.BOLD,45));
        return jlbLetra;
    }
    private JPanel criarPainelShifts(){
        JPanel jp=new JPanel(new BorderLayout());
        JButton shiftEsquerda=new JButton("«");
        JButton shiftDireita=new JButton("»");
        shiftEsquerda.addActionListener((ActionEvent ae) -> {
            Component[] jpLetrasClone=jpLetras.getComponents();
            for(int i=0;i<jpLetras.getComponentCount();i++){
                if(i==jpLetras.getComponentCount()-1){
                    jpLetras.setComponentZOrder(jpLetrasClone[0],i);
                }else{
                    jpLetras.setComponentZOrder(jpLetrasClone[i+1],i);
                }
            }
            revalidate();
        });
        shiftDireita.addActionListener((ActionEvent ae) -> {
            Component[] jpLetrasClone=jpLetras.getComponents();
            for(int i=0;i<jpLetras.getComponentCount();i++){
                if(i==0){
                    jpLetras.setComponentZOrder(jpLetrasClone[jpLetras.getComponentCount()-1],i);
                }else{
                    jpLetras.setComponentZOrder(jpLetrasClone[i-1],i);
                }
            }
            revalidate();
        });
        jp.add(shiftEsquerda,BorderLayout.WEST);
        jp.add(shiftDireita,BorderLayout.EAST);
        return jp;
    }
}