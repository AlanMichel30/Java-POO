import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String numeroPedido;
    private String data;
    private List<Item> itens;
    private double valorTotal;

    public Pedido(String numeroPedido, String data){
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.itens = new ArrayList();
        this.valorTotal = 0;
    }
    public void inserirItemPedido(Item item){
        this.itens.add(item);
        this.valorTotal+= item.getPreco();
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido='" + numeroPedido + '\'' +
                ", data='" + data + '\'' +
                ", itens=" + itens +
                ", valorTotal=" + valorTotal +
                '}';
    }
}


