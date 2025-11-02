public class Escola {
    private String nome;
    private String endereco;
    private int numeroSalas;
    private String diretor;

    public Escola(String nome, String endereco, int numeroSalas, String diretor) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroSalas = numeroSalas;
        this.diretor = diretor;
    }

    public void abrirPortas() {
        System.out.println(nome + " está abrindo as portas.");
    }

    public void fecharPortas() {
        System.out.println(nome + " está fechando as portas.");
    }

    public void realizarAulas() {
        System.out.println("As aulas estão sendo realizadas na " + nome + ".");
    }

    public void matricularAluno() {
        System.out.println("Um novo aluno foi matriculado na " + nome + ".");
    }

    public void exibirInfo() {
        System.out.println("Escola: " + nome + ", Endereço: " + endereco + ", Salas: " + numeroSalas + ", Diretor: " + diretor);
    }
}