import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Item item = new Item("Coca-cola","Refrigerante",5.0);
        Item item2 = new Item("Pizza","Pizza Calabresa",20.0);
        Item item3 = new Item("Hamburguer","Hamburguer de carne",10.0);
        Item item4 = new Item("Batata frita","Batata porçao",10.0);
        Item item5 = new Item("Sorvete","Sorvete de chocolate",5.0);

        Pedido pedido = new Pedido("1","16/10/2024");
        pedido.inserirItemPedido(item);
        pedido.inserirItemPedido(item2);
        pedido.inserirItemPedido(item3);
        pedido.inserirItemPedido(item4);
        pedido.inserirItemPedido(item5);
        System.out.println(pedido);
    }
}