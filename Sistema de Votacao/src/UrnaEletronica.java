import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class UrnaEletronica {
    private List<Candidato> candidatos = new ArrayList<>();
    private HashMap<Candidato, Integer> votos = new HashMap<>();
    private List<String> eleitoresQueVotaram = new ArrayList<>();

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
        votos.put(candidato, 0);
    }

    public void exibirCandidatos() {
        System.out.println("Candidatos disponíveis para votação:");
        for (int i = 0; i < candidatos.size(); i++) {
            Candidato candidato = candidatos.get(i);
            System.out.println((i + 1) + ". " + candidato.getNome() + " - Partido: " + candidato.getPartido());
        }
    }

    public void votar(Eleitor eleitor, int numeroCandidato) {
        if (eleitoresQueVotaram.contains(eleitor.getCpf())) {
        }
        Candidato candidatoEscolhido = candidatos.get(numeroCandidato - 1);
        votos.put(candidatoEscolhido, votos.get(candidatoEscolhido) + 1);
        eleitoresQueVotaram.add(eleitor.getCpf());

        System.out.println(eleitor.getNome() + " votou em " + candidatoEscolhido.getNome());
    }
    public void exibirResultado() {
        for (Candidato candidato : candidatos) {
            System.out.println(candidato.getNome() + " - Votos: " + votos.get(candidato));
        }
    }
}