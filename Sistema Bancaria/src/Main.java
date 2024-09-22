
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Alan Michel", "123.456.789.0");
        ContaBancaria banco = new ContaBancaria(cliente, 1000.00, "0001-20");
        System.out.println("Nome: " + cliente.getNome());

        banco.deposito(500);
        banco.saque(100);
        System.out.println("Saldo é "+ banco.getSaldo());

        }
    }
