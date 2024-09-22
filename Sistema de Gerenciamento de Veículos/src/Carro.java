public class Carro extends Veiculo{
    private String  tipoCombustivel;

    public Carro(String placa, double quilometragem, String modelo, String tipoCombustivel) {
        super(placa, quilometragem, modelo);
        this.tipoCombustivel = tipoCombustivel;
    }

    public Carro() {
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipoCombustivel='" + tipoCombustivel + '\'' +
                super.toString() +
                '}';
    }
}



