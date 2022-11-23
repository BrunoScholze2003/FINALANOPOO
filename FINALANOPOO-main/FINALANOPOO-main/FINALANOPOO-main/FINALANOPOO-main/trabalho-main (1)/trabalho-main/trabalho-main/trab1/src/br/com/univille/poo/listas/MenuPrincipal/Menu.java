package br.com.univille.poo.listas.MenuPrincipal;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;

public class Menu extends JFrame{
    JButton adicionarTarefa = new JButton();
    JLabel labelNomeTarefa = new JLabel();
    JLabel labelDescricaoTarefa = new JLabel();

   

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

        labelNomeTarefa = new JLabel("Nome tarefa");                                         //DUVIDA
        labelNomeTarefa.setBounds(100,100,100,100);

        labelDescricaoTarefa = new JLabel("Nome tarefa");                                         //DUVIDA
        labelDescricaoTarefa.setBounds(200,100,100,100);
       


      
        
        
        panel.add(labelDescricaoTarefa);
        panel.add(labelNomeTarefa);
        add(panel);

        
    }

   
    
}
