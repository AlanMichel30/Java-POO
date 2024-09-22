public  class FuncionarioPJ extends Funcionario{
    private int horaTrabalho;
    private double valorPorHoras;

    public FuncionarioPJ(String nome, String cpf, double salarioBase, int horaTrabalho, double valorPorHoras) {
        super(nome, cpf, salarioBase);
        this.horaTrabalho = horaTrabalho;
        this.valorPorHoras = valorPorHoras;
    }



    public int getHoraTrabalho() {
        return horaTrabalho;
    }

    public void setHoraTrabalho(int horaTrabalho) {
        this.horaTrabalho = horaTrabalho;
    }

    public double getValorPorHoras() {
        return valorPorHoras;
    }

    public void setValorPorHoras(double valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }

    public double calcularPagamentos(){
        return horaTrabalho * valorPorHoras;
    }
}
