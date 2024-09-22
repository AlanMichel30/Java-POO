import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private String cpf;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
    public boolean adicionarLivroEmprestado(Livro livro) {
        if (livrosEmprestados.size() >= 3) {
            System.out.println("Usuário já possui 3 livros emprestados.");
            return false;
        }
        livrosEmprestados.add(livro);
        return true;
    }

    public void removerLivroEmprestado(Livro livro) {
        livrosEmprestados.remove(livro);
    }
}