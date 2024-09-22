import java.util.ArrayList;
import java.util.List;

class Jogador {
    private String nome;
    private List<Carta> mao;

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public void adicionarCarta(Carta carta) {
        mao.add(carta);
    }

    public void exibirMao() {
        System.out.println("Mão de " + nome + ":");
        for (Carta carta : mao) {
            System.out.println(carta);
        }
    }

    public int calcularValorTotal() {
        int total = 0;
        for (Carta carta : mao) {
            total += carta.getValor();
        }
        return total;
    }
}