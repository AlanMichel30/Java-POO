public class FuncionarioCLT extends Funcionario{

    public FuncionarioCLT(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    public double calcularPagamento() {
        return super.getSalarioBase();
    }
}
