package br.com.univille.poo.listas.MenuPrincipal;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Menu extends JFrame{
    JButton adicionarTarefa = new JButton();
    JLabel labelNomeTarefa = new JLabel();
    JLabel labelDescricaoTarefa = new JLabel();
    JLabel labelConluirTarefa = new JLabel();
    JLabel labelExcluirTarefa = new JLabel();

   

    public Menu(){
        setTitle("Menu de tarefas");
        setSize(1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
        setLayout(null);
    }

    public void configurarJanela(){
        JPanel panel = new JPanel();
        panel.setLayout(null);

        adicionarTarefa.setFont(new java.awt.Font("Courier", Font.PLAIN, 12)); // NOI18N           //DUVIDA
        adicionarTarefa.setForeground(new java.awt.Color(0, 153, 102));
        adicionarTarefa = new JButton("Adicinar tarefa");
        panel.add(adicionarTarefa);
        adicionarTarefa.setBounds(0,0,1000,100);

        labelNomeTarefa = new JLabel("Nome tarefa");                                      
        labelNomeTarefa.setBounds(100,100,100,100);

        labelDescricaoTarefa = new JLabel("Descrição");                                         
        labelDescricaoTarefa.setBounds(350,100,100,100);

        labelConluirTarefa = new JLabel("Concluida");                                         
        labelConluirTarefa.setBounds(650,100,100,100);

        labelExcluirTarefa = new JLabel("Excluir");                                         
        labelExcluirTarefa.setBounds(900,100,100,100);

        //FAZER O JPANEL PARA O RISCO
       


      
        
        
        panel.add(labelDescricaoTarefa);
        panel.add(labelConluirTarefa);
        panel.add(labelExcluirTarefa);
        panel.add(labelNomeTarefa);
        add(panel);

        
    }

   
    
}
