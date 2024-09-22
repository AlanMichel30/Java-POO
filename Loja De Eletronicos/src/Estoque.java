import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void aplicarDesconto(String nomeProduto, double percentual) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                produto.aplicarDesconto(percentual);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
