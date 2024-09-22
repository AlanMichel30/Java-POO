public class Main {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();

        Funcionario clt = new FuncionarioCLT("João Silva", "123.456.789-00", 3000.00);
        Funcionario pj = new FuncionarioPJ("Maria Oliveira", "987.654.321-00", 50, 160, 25);

        folha.adicionarFuncionario(clt);
        folha.adicionarFuncionario(pj);

        folha.gerarPagamentos();
    }
}
