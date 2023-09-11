package tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private final List<Tarefa> tarefas;

    public ListaDeTarefas(){
         tarefas = new ArrayList<>();
    }

    public void adicionarTarefa (Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public void removerTarefa (String descricao){
        for (Tarefa tarefa: tarefas){
            if (tarefa.getDescricao().equals( descricao)){
                tarefas.remove(tarefa);
                return;
            }
        }
    }

    public int totalDeTarefas(){
        return tarefas.size();
    }

    public void descricoesTarefas(){
        System.out.println("Apresentando as descrições das tarefas: ");
        for (Tarefa tarefa:tarefas){
            System.out.println(tarefa.getDescricao());
        }
    }

    public void listarTarefas(){
        System.out.println("Lista de Tarefas: ");
        for (Tarefa tarefa : tarefas){
            System.out.println(tarefa);
        }
    }
}
