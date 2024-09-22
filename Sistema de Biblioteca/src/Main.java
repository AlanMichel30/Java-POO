import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-8578271234");
        Livro livro2 = new Livro("1984", "George Orwell", "978-0451524935");
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", "978-8491050189");

        Usuario usuario1 = new Usuario("Alan Michel", "123.456.789-00");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.emprestarLivro(usuario1, livro1, new Date());
        biblioteca.emprestarLivro(usuario1, livro2, new Date());
        biblioteca.emprestarLivro(usuario1, livro3, new Date());

        Livro livro4 = new Livro("Moby Dick", "Herman Melville", "978-0142437247");
        biblioteca.emprestarLivro(usuario1, livro4, new Date());

        biblioteca.devolverLivro(usuario1, livro1, new Date());
    }
}