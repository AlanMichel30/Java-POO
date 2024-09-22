import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        UrnaEletronica urna = new UrnaEletronica();

        Candidato candidato1 = new Candidato("Lula", "13");
        Candidato candidato2 = new Candidato("jair bolsonaro", "22");


        urna.adicionarCandidato(candidato1);
        urna.adicionarCandidato(candidato2);

        Eleitor eleitor1 = new Eleitor("Ana Paula", "123.456.789-00");
        Eleitor eleitor2 = new Eleitor("Alan Michel", "987.654.321-00");
        Eleitor eleitor3 = new Eleitor("Israel Lopes", "456.789.123-00");
        Eleitor eleitor4 = new Eleitor("vinicius", "480.789.150-00");

        urna.exibirCandidatos();

        System.out.println("\n");


        urna.votar(eleitor1, 1);


        urna.votar(eleitor2, 2);


        urna.votar(eleitor3, 2);


        urna.votar(eleitor4, 2);

        System.out.println("\nResultado da Eleição:");
        urna.exibirResultado();
    }
}