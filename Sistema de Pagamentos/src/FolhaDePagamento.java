import java.util.ArrayList;
import java.util.List;

class FolhaDePagamento {
    private List<Funcionario> funcionarios;

    public FolhaDePagamento() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void gerarPagamentos() {
        System.out.println("Folha de Pagamento:");
        for (Funcionario f : funcionarios) {
            System.out.printf("Funcionário: %s (CPF: %s) - Pagamento: R$ %.2f%n",
                    f.getNome(), f.getCpf(), f.calcularPagamentos());
        }
    }
}