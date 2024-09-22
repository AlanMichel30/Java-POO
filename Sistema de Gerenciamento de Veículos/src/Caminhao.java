public class Caminhao extends Veiculo{
    private String capacidadeDeCarga;

    public Caminhao(String placa, double quilometragem, String modelo, String capacidadeDeCarga) {
        super(placa, quilometragem, modelo);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public Caminhao() {
    }

    public String getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(String capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "capacidadeDeCarga='" + capacidadeDeCarga + '\'' +
                super.toString() +
                '}';
    }
}

