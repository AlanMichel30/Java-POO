import java.util.Date;

class Reserva {
    private Quarto quarto;
    private Cliente cliente;
    private Date dataEntrada;
    private Date dataSaida;

    public Reserva(Quarto quarto, Cliente cliente, Date dataEntrada, Date dataSaida) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        quarto.setDisponibilidade(false); // Marcar o quarto como indisponível
    }

    public double calcularValorEstadia() {
        long diferencaEmMillis = dataSaida.getTime() - dataEntrada.getTime();
        long dias = diferencaEmMillis / (1000 * 60 * 60 * 24);
        return quarto.calcularPreco() * dias;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }
}