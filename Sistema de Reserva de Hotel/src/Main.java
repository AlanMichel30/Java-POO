import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Quarto quarto1 = new Quarto(101, "individual");
        Quarto quarto2 = new Quarto(102, "casal");


        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");


        Date dataEntrada = new Date();
        Date dataSaida = new Date(dataEntrada.getTime() + (2 * 24 * 60 * 60 * 1000));

        if (quarto1.isDisponivel()) {
            Reserva reserva = new Reserva(quarto1, cliente1, dataEntrada, dataSaida);
            System.out.printf("Reserva realizada: %s em quarto %d por R$ %.2f%n",
                    reserva.getCliente().getNome(),
                    reserva.getQuarto().getNumero(),
                    reserva.calcularValorEstadia());
        } else {
            System.out.println("Quarto indisponível.");
        }
    }
}