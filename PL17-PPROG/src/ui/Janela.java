package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import model.*;
public class Janela extends JFrame{
    private JTextField txtData;
    private JTextField txtDiaDaSemana;
    private JLabel jlbDataExtenso;
    private ActionListener alDiaDaSemana;
    private ActionListener alDataPorExtenso;
    private ActionListener alLimpar;
    private Data data;
    private static final String DATA="Data (aaaa/mm/dd):";
    private static final String DIA_DA_SEMANA="Dia da Semana:";
    private static final String DATA_EXTENSO="Data por Extenso";
    private static final String LIMPAR="Limpar";
    private static final String TOOL_TIP_DIA_DA_SEMANA="Imprime o dia da semana";
    private static final String TOOL_TIP_DATA_EXTENSO="Imprime a data por extenso";
    private static final String TOOL_TIP_LIMPAR="Limpa todo o conteúdo";
    private static final String ERRO="ERRO!";
    private static final Dimension LARGURA_LABEL=new JLabel(DATA).getPreferredSize();
    private static final int LARGURA_TEXT_FIELD=8;
    private static final int ALTURA=300;
    private static final int LARGURA=300;
    private static final int ANO=0;
    private static final int MES=1;
    private static final int DIA=2;
    private static final int LINHAS=4;
    private static final int COLUNAS=1;
    public Janela(String titulo){
        super(titulo);
        add(criarPainelData(),BorderLayout.NORTH);
        add(criarPainelDiaDaSemana(),BorderLayout.CENTER);
        add(criarPainelDataExtenso(),BorderLayout.SOUTH);
        add(criarPainelButoes(),BorderLayout.PAGE_END);
        configuracao();
    }
    //Configuração da Janela
    private void configuracao(){
        setLayout(new GridLayout(LINHAS,COLUNAS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setSize(LARGURA,ALTURA);
        pack();
        setVisible(true);
    }
    //Painel da data
    private JPanel criarPainelData(){
        JPanel jp=new JPanel();
        jp.add(new JLabel(DATA));
        txtData=new JTextField(LARGURA_TEXT_FIELD);
        jp.add(txtData);
        return jp;
    }
    //Painel do dia da semana
    private JPanel criarPainelDiaDaSemana(){
        JPanel jp=new JPanel();
        JLabel jlb=new JLabel(DIA_DA_SEMANA);
        //Alinha o JLabel da data com o JLabel do dia da semana
        jlb.setPreferredSize(LARGURA_LABEL);
        jp.add(jlb);
        txtDiaDaSemana=new JTextField(LARGURA_TEXT_FIELD);
        txtDiaDaSemana.setEditable(false);
        jp.add(txtDiaDaSemana);
        return jp;
    }
    //Painel dos botões
    private JPanel criarPainelButoes(){
        JPanel jp=new JPanel();
        JButton btnDiaDaSemana=new JButton(DIA_DA_SEMANA);
        JButton btnDataPorExtenso=new JButton(DATA_EXTENSO);
        JButton btnLimpar=new JButton(LIMPAR);
        criarActionListeners();
        btnDiaDaSemana.addActionListener(alDiaDaSemana);
        btnDataPorExtenso.addActionListener(alDataPorExtenso);
        btnLimpar.addActionListener(alLimpar);
        //Adiciona os tool tips
        btnDiaDaSemana.setToolTipText(TOOL_TIP_DIA_DA_SEMANA);
        btnDataPorExtenso.setToolTipText(TOOL_TIP_DATA_EXTENSO);
        btnLimpar.setToolTipText(TOOL_TIP_LIMPAR);
        //Adiciona a tecla Enter como mecanomica do botão Dia da Semana
        btnDiaDaSemana.setMnemonic(KeyEvent.VK_ENTER);
        jp.add(btnDiaDaSemana,JPanel.LEFT_ALIGNMENT);
        jp.add(btnDataPorExtenso,JPanel.CENTER_ALIGNMENT);
        jp.add(btnLimpar,JPanel.RIGHT_ALIGNMENT);
        return jp;
    }
    //ActionListeners dos botões
    private void criarActionListeners(){
        alDiaDaSemana=(ActionEvent ae) ->{
            leituraDiaDaSemana();
        };
        alDataPorExtenso=(ActionEvent ae) -> {
            leituraDataExtenso();
        };
        alLimpar=(ActionEvent ae) -> {
            txtData.setText(null);
            txtDiaDaSemana.setText(null);
            jlbDataExtenso.setText(null);
        };
    }
    //Painel da data por extenso
    private JPanel criarPainelDataExtenso(){
        JPanel jp=new JPanel();
        jlbDataExtenso=new JLabel();
        jp.add(jlbDataExtenso);
        return jp;
    }
    private void leituraDiaDaSemana(){
        try{
            String[] dataSplit=txtData.getText().split("/");
            data=new Data(Integer.parseInt(dataSplit[ANO]),Integer.parseInt(dataSplit[MES]),Integer.parseInt(dataSplit[DIA]));
            txtDiaDaSemana.setText(data.diaDaSemana());
        }catch(MesInvalidoException | DiaInvalidoException e){
            JOptionPane.showMessageDialog(this,e.getMessage(),ERRO,JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,txtData.getText()+" é inválido!!",ERRO,JOptionPane.ERROR_MESSAGE);
        }
    }
    private void leituraDataExtenso(){
        try{
            String[] dataSplit=txtData.getText().split("/");
            data=new Data(Integer.parseInt(dataSplit[ANO]),Integer.parseInt(dataSplit[MES]),Integer.parseInt(dataSplit[DIA]));
            jlbDataExtenso.setText(data.toString());
        }catch(MesInvalidoException | DiaInvalidoException e){
            JOptionPane.showMessageDialog(this,e.getMessage(),ERRO,JOptionPane.ERROR_MESSAGE);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,txtData.getText()+" é inválido!!",ERRO,JOptionPane.ERROR_MESSAGE);
        }
    }
}