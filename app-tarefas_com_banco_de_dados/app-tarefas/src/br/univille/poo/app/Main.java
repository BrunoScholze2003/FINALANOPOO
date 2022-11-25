package br.univille.poo.app;

import br.univille.poo.app.entidade.Tarefa;
import br.univille.poo.app.persistencia.CriarTabelas;
import br.univille.poo.app.servico.ConcluirTarefa;
import br.univille.poo.app.servico.CriarTarefa;
import br.univille.poo.app.servico.ListarTarefas;
import br.univille.poo.app.ui.ListaDeTarefasView;

public class Main {

    public static void main(String[] args) {

        CriarTabelas.criarTabelas();

        ListaDeTarefasView listaDeTarefasView = new ListaDeTarefasView();
        listaDeTarefasView.setVisible(true);

        /*

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Segunda tarefa");


        CriarTarefa criarTarefa = new CriarTarefa();
        try {
            criarTarefa.criar(tarefa);
        }catch (Exception e){
            e.printStackTrace();
        }

        ListarTarefas listarTarefas = new ListarTarefas();
        for(Tarefa t : listarTarefas.obterTodos()){
            System.out.println(t);
            if(t.getId() == 3){
                ConcluirTarefa concluirTarefa = new ConcluirTarefa();
                try {
                    concluirTarefa.concluir(t);
                }catch (Exception ignored){}
            }
        }

        */

    }

}
