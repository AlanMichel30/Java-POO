import java.util.Date;

class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, Date dataEmprestimo) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void devolverLivro(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
        livro.setEmprestado(false);
        usuario.removerLivroEmprestado(livro);
        System.out.println("Livro devolvido: " + livro.getTitulo());
    }
}