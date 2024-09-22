public class Notebook extends Produto {
    private String processador;
    private String memoria;
    private String sdd;

    public Notebook(String nome, double preco, int quantidadeEmEstoque, String processador, String memoria, String sdd) {
        super(nome, preco, quantidadeEmEstoque);
        this.processador = processador;
        this.memoria = memoria;
        this.sdd = sdd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getSdd() {
        return sdd;
    }

    public void setSdd(String sdd) {
        this.sdd = sdd;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "processador='" + processador + '\'' +
                ", memoria='" + memoria + '\'' +
                ", sdd='" + sdd + '\'' +
                super.toString()+
                '}';
    }
}
