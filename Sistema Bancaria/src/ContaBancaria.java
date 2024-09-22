public class ContaBancaria {
    private Cliente titular;
    private double saldo;
    private String numeroDaConta;

    public ContaBancaria(Cliente titular, double saldo, String numeroDaConta){
        this.titular = titular;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public void deposito(double valor){
        this.setSaldo(this.getSaldo()+ valor);
        System.out.println("Depositou : "+ valor);
    }

    public void saque(double saque){
        this.saldo -=saque;
        System.out.println("Saque foi: "+ saque);
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
