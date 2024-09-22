public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Engenharia de Software", "ES101", 48);
        Curso curso2 = new Curso("Sistemas de Informação", "SI202", 36);

        Estudante estudante1 = new Estudante("Alice", 2021001);
        Estudante estudante2 = new Estudante("Bob", 2021002);
        Estudante estudante3 = new Estudante("Carlos", 2021003);


        System.out.println(estudante1);


        curso1.matricularEstudante(estudante2);
        curso2.matricularEstudante(estudante2);
        curso2.matricularEstudante(estudante3);


    }
}