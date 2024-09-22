class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private Baralho baralho;

    public Jogo(String nomeJogador1, String nomeJogador2) {
        jogador1 = new Jogador(nomeJogador1);
        jogador2 = new Jogador(nomeJogador2);
        baralho = new Baralho();
        baralho.embaralhar();
    }

    public void iniciar() {
        System.out.println("Iniciando o jogo...");

        for (int i = 0; i < 5; i++) {
            jogador1.adicionarCarta(baralho.comprarCarta());
            jogador2.adicionarCarta(baralho.comprarCarta());
        }

        jogador1.exibirMao();
        jogador2.exibirMao();

        determinarVencedor();
    }

    public void determinarVencedor() {
        int valorJogador1 = jogador1.calcularValorTotal();
        int valorJogador2 = jogador2.calcularValorTotal();

        System.out.println("\nTotal de " + jogador1.getNome() + ": " + valorJogador1);
        System.out.println("Total de " + jogador2.getNome() + ": " + valorJogador2);

        if (valorJogador1 > valorJogador2) {
            System.out.println("Vencedor: " + jogador1.getNome());
        } else if (valorJogador2 > valorJogador1) {
            System.out.println("Vencedor: " + jogador2.getNome());
        } else {
            System.out.println("Empate!");
        }
    }
}