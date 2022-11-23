package br.com.univille.poo.listas.MenuPrincipal;

import javax.swing.*;
import javax.swing.JFrame;

public class Menu extends JFrame{
    JButton adicionarTarefa = new JButton();
   

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
        adicionarTarefa.setBounds(200,100,100,50);
        adicionarTarefa = new JButton("Adicinar tarefa");
      
        
        

        panel.add(adicionarTarefa);
        add(panel);
        
    }

   
    
}
