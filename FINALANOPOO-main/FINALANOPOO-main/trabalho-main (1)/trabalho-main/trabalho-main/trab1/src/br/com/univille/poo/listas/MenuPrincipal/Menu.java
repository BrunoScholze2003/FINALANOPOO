package br.com.univille.poo.listas.MenuPrincipal;

import javax.swing.*;
import javax.swing.JFrame;

public class Menu extends JFrame{
    JButton adicionarTarefa = new JButton();
    JLabel labelNomeTarefa = new JLabel();

   

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

        //adicionarTarefa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N           //DUVIDA
        //adicionarTarefa.setForeground(new java.awt.Color(0, 153, 102));
        adicionarTarefa = new JButton("Adicinar tarefa");
        panel.add(adicionarTarefa);
        adicionarTarefa.setBounds(0,0,1000,100);

        labelNomeTarefa = new JLabel();                                           //DUVIDA
        labelNomeTarefa.setText("Nome tarefa");


      
        
        

        panel.add(labelNomeTarefa);
        add(panel);

        
    }

   
    
}
