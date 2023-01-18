import vetor.Locacoes;
import vetor.Clientes;
import vetor.Veiculos;
import ui.UILocadora;

public class Main {
    public static void main(String[] args){

        Clientes clientes = new Clientes();
        Veiculos veiculos = new Veiculos();
        Locacoes locacoes = new Locacoes();

        new UILocadora();

    }
}
