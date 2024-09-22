public class Smartphone extends Produto{
    private int capacidadeDaBateria;
    private int camera;

    public Smartphone(String nome, double preco, int quantidadeEmEstoque, int capacidadeDaBateria, int camera) {
        super(nome, preco, quantidadeEmEstoque);
        this.capacidadeDaBateria = capacidadeDaBateria;
        this.camera = camera;
    }

    public int getCapacidadeDaBateria() {
        return capacidadeDaBateria;
    }

    public void setCapacidadeDaBateria(int capacidadeDaBateria) {
        this.capacidadeDaBateria = capacidadeDaBateria;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "capacidadeDaBateria= " + capacidadeDaBateria +
                ", camera= " + camera + '\'' +
                super.toString()+
                '}';
    }
}

