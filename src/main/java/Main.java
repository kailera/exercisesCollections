import carrinho.CarrinhoDeCompras;
import carrinho.Item;
import tarefas.ListaDeTarefas;
import tarefas.Tarefa;

import java.util.Scanner;

public class Main {

    public static void mensagemDoMenu(){
        System.out.println("Bem vindo aos teste das Collections! Escolha uma aplicação para testar:\n" +
                "1: Lista de tarefas \n" +
                "2: Carrinho de Compras \n" +
                "3: Biblioteca");
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        mensagemDoMenu();

        int entrada = scanner.nextInt();

        switch (entrada){
            case 1:
                listaDeTarefas();
                break;

            case 2:
                carrinhoDeCompras();
                break;

            case 3:
                biblioteca();
                break;

            default:
                System.out.println("Opção Não encontrada :(");
                mensagemDoMenu();
                break;
        }

    }

    private static void biblioteca() {
        System.out.println("Testando a Aplicação Biblioteca: \n");

    }

    private static void carrinhoDeCompras() {
        System.out.println("Testando a Aplicação Carrinho de Compras: \n");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        Item item1 = new Item("Caneta", 1.00, 3);
        Item item2 = new Item("Lapiseira", 2.00, 2);
        Item item3 = new Item("Caderno ", 5.00, 2);

        carrinhoDeCompras.adicionarItem(item1);
        carrinhoDeCompras.adicionarItem(item2);
        carrinhoDeCompras.adicionarItem(item3);

        carrinhoDeCompras.exibirCarrinho();

        carrinhoDeCompras.removerItem("Caneta");

        carrinhoDeCompras.exibirCarrinho();

    }

    private static void listaDeTarefas() {
        System.out.println("Testando a Aplicação Lista de Tarefas: \n");

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

        System.out.println("Testando a Aplicação Carrinho de Compras");
    }

    public static void main(String[] args) {
       menu();
    }
}
