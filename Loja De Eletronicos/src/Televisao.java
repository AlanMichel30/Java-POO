public class Televisao extends Produto{
    private String tamanhoDaTela;
    private int resolucao;

    public Televisao(String nome, double preco, int quantidadeEmEstoque, String tamanhoDaTela, int resolucao) {
        super(nome, preco, quantidadeEmEstoque);
        this.tamanhoDaTela = tamanhoDaTela;
        this.resolucao = resolucao;
    }

    public String getTamanhoDaTela() {
        return tamanhoDaTela;
    }

    public void setTamanhoDaTela(String tamanhoDaTela) {
        this.tamanhoDaTela = tamanhoDaTela;
    }

    public int getResolucao() {
        return resolucao;
    }

    public void setResolucao(int resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "tamanhoDaTela='" + tamanhoDaTela + '\'' +
                ", resolucao=" + resolucao + '\'' +
                super.toString()+
                '}';
    }
}
