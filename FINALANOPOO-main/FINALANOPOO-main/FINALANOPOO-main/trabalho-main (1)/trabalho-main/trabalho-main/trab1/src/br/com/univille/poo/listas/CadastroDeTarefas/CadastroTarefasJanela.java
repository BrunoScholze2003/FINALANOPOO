package br.com.univille.poo.listas.CadastroDeTarefas;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTarefasJanela extends JFrame {

    private String[] opcoes = {"Fácil","Medil","Difícil"};
    JComboBox opcoesComboBox = new JComboBox<>();
    JTextArea nomeTarefaTextArea = new JTextArea();
    JTextArea descricaoTarefaTextArea = new JTextArea();
    JLabel tarefasLabel = new JLabel();
    JLabel prioridadeLabel = new JLabel();
    JLabel descricaoLabel = new JLabel();
    JButton calcularCancelar = new JButton();
    JButton calcularSalvar = new JButton();

    public CadastroTarefasJanela(){
        setTitle("Cadastro de Tarefas");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    public void configurarJanela(){
        JPanel panel = new JPanel();
        tarefasLabel = new JLabel();
        prioridadeLabel = new JLabel();
        nomeTarefaTextArea = new JTextArea();
        descricaoTarefaTextArea = new JTextArea();


        tarefasLabel.setText("Nome Tarefa: ");
        prioridadeLabel.setText("Prioridade: ");
        descricaoLabel.setText("Descrição: ");


        nomeTarefaTextArea = new JTextArea();
        nomeTarefaTextArea.setColumns(30);
        nomeTarefaTextArea.setRows(1);
        nomeTarefaTextArea.setLineWrap(true);
        nomeTarefaTextArea.setBorder(BorderFactory.createLineBorder(Color.black));

        descricaoTarefaTextArea = new JTextArea();
        descricaoTarefaTextArea.setColumns(30);
        descricaoTarefaTextArea.setRows(4);
        descricaoTarefaTextArea.setLineWrap(true);
        descricaoTarefaTextArea.setBorder(BorderFactory.createLineBorder(Color.black));

        opcoesComboBox = new JComboBox<>(opcoes);
        opcoesComboBox.setPreferredSize( new Dimension(350,30));

        calcularCancelar = new JButton("Cancelar");
        calcularSalvar = new JButton("Salvar");
        calcularSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });



        panel.add(tarefasLabel);
        panel.add(nomeTarefaTextArea);  
        panel.add(descricaoLabel);
        panel.add(descricaoTarefaTextArea);
        panel.add(prioridadeLabel);
        panel.add(opcoesComboBox);
        panel.add(calcularCancelar);
        panel.add(calcularSalvar);

        add(panel);
    }

    private void calcularResultado() {
        String tarefa = nomeTarefaTextArea.getText();
    }
}