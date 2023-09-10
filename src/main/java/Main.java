import list.ListaDeTarefas;
import list.Tarefa;

public class Main {
    public static void main(String[] args) {
        ListaDeTarefas list = new ListaDeTarefas();

        Tarefa tarefa1 = new Tarefa("Ler a Bíblia", "Ler a bíblia por 30 minutos");
        Tarefa tarefa2 = new Tarefa("Estudar POO", "Estudar as caracteríticas poo");

        list.adicionarTarefa(tarefa1);
        list.adicionarTarefa(tarefa2);

        list.descricoesTarefas();
        System.out.println(list.totalDeTarefas());

        list.removerTarefa("Estudar as caracteríticas poo");

        list.descricoesTarefas();
        System.out.println(list.totalDeTarefas());
    }
}
