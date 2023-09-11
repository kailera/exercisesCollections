package carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> carrinho;

    public CarrinhoDeCompras(){
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        carrinho.add(item);
    }

    public void removerItem(String nome){

        for(Item item : carrinho){
            if(item.getNome().equals(nome)){
                carrinho.remove(item);
                System.out.println("Item "+ nome + "removido do carrinho de compras.");
                return;
            }
        }
    }

    public int calcularValorTotal(){
        int valorTotal = 0;

        for (Item item : carrinho){
            int valorItem = (int) (item.getQuantidade() * item.getPreco());
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirCarrinho(){
        System.out.println("Carrinho: ");
        for (Item item : carrinho){
            int valorItem = (int) (item.getQuantidade() * item.getPreco());
            System.out.println(" Nome: "+ item.getNome() +"\n" +
                                "Quantidade: " + item.getQuantidade() +"\n" +
                                " Preço: " + item.getPreco() +"\n" +
                                "Valor total do item: " + valorItem +"\n" +
                                "***********************************\n"
                                ) ;
        }
        System.out.println("Valor total do carrinho: "+calcularValorTotal());
    }
}
