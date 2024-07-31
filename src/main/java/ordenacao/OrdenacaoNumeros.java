package ordenacao;

import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    // atributos
    private List<Integer> numerosList;

    // constructor
    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void AdicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer>OrdenarAscendente(){
        List<Integer>numerosAscendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer>OrdenarDescendente(){
        List<Integer>numerosDescendentes = new ArrayList<>(this.numerosList);
        if(!numerosList.isEmpty()){
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.AdicionarNumero(1);
        numeros.AdicionarNumero(3);
        numeros.AdicionarNumero(7);
        numeros.AdicionarNumero(9);
        numeros.AdicionarNumero(3);
        numeros.AdicionarNumero((int)Math.random());
        numeros.AdicionarNumero(90);
        
        numeros.exibirNumeros();

        System.out.println(numeros.OrdenarAscendente());
        System.out.println(numeros.OrdenarDescendente());

        numeros.exibirNumeros();
    }
}
