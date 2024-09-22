import java.util.ArrayList;
import java.util.List;

public class Estudante  {
    private String nome;
    private int matricula;
    private List<Curso> cursos;

    public Estudante(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", cursos=" + cursos +
                super.toString()+
                '}';
    }
}


