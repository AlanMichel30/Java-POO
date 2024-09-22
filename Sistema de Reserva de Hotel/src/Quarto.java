class Quarto {
    private int numero;
    private String tipo; // "individual", "casal", etc.
    private boolean disponivel;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponivel = true; // Inicialmente todos os quartos estão disponíveis
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponibilidade(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double calcularPreco() {
        switch (tipo.toLowerCase()) {
            case "individual":
                return 100.00; // Preço por noite para quarto individual
            case "casal":
                return 150.00; // Preço por noite para quarto casal
            default:
                return 0.00; // Tipo inválido
        }
    }
}
