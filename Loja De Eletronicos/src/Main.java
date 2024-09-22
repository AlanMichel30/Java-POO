public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Smartphone smartphone = new Smartphone("iPhone 13", 5500.00, 10, 4000, 12);
        Notebook notebook = new Notebook("Samsung", 2500.00, 5, "Intel i5", "8GB", "256GB");
        Televisao televisao = new Televisao("Samsung Smart TV", 2000.00, 3, "4K", 55);

        estoque.adicionarProduto(smartphone);
        estoque.adicionarProduto(notebook);
        estoque.adicionarProduto(televisao);

        System.out.println("Produtos disponíveis:"); // Valor está normal, sem desconto
        estoque.listarProdutos();

        estoque.aplicarDesconto("iPhone 13", 10); // iPhone 10% desconto pagar R$ 4.950,00
        estoque.aplicarDesconto("Samsung", 10);   // Samsung 10% desconto pagar R$ 2250,00
        estoque.aplicarDesconto("Samsung Smart TV", 10);  // Samsung Smart TV 10% desconto pagar R$ 1800,00
        System.out.println("\n Após aplicar desconto:");
        estoque.listarProdutos();
    }
}