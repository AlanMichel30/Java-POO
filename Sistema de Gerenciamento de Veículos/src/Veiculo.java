public class Veiculo {
    private String placa;
    private String modelo;
    private double quilometragem;

    public Veiculo(String placa, double quilometragem, String modelo) {
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.modelo = modelo;
    }

    public Veiculo(){
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", quilometragem=" + quilometragem +
                '}';
    }
}
