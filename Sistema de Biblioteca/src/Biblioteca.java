import java.util.Date;
import java.util.List;
import java.util.ArrayList;

class Biblioteca {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void emprestarLivro(Usuario usuario, Livro livro, Date dataEmprestimo) {
        if (livro.isEmprestado()) {
            System.out.println("O livro já está emprestado: " + livro.getTitulo());
            return;
        }
        if (usuario.adicionarLivroEmprestado(livro)) {
            Emprestimo emprestimo = new Emprestimo(usuario, livro, dataEmprestimo);
            emprestimos.add(emprestimo);
            livro.setEmprestado(true);
            System.out.println("Livro emprestado: " + livro.getTitulo() + " para " + usuario.getNome());
        }
    }

    public void devolverLivro(Usuario usuario1, Livro livro1, Date date) {
    }
}
