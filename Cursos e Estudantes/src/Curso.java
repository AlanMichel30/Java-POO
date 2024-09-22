import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;//
    private String codigo;
    private int duracao;
    private List<Estudante> estudantes;

    public Curso(String nome, String codigo, int duracao) {
        this.nome = nome;
        this.codigo = codigo;
        this.duracao = duracao;
        this.estudantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void matricularEstudante(Estudante estudante) {//pra printar precisa de retorno
        if (!estudantes.contains(estudante)) {
            estudantes.add(estudante);
            estudante.adicionarCurso(this);
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", duracao=" + duracao +
                ", estudantes=" + estudantes +//aqui é um objeto que é uma lista, ai precisa criar um loop para imprimr cada estudante
                toString()+
                '}';
    }
}
