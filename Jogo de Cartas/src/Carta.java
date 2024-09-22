class Carta {
    private String naipe;
    private int valor;

    public Carta(String naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String valorNome;
        switch (valor) {
            case 11: valorNome = "Valete"; break;
            case 12: valorNome = "Dama"; break;
            case 13: valorNome = "Rei"; break;
            case 14: valorNome = "Ás"; break;
            default: valorNome = String.valueOf(valor); break;
        }
        return valorNome + " de " + naipe;
    }
}







