public class Animal {
    private String especie;
    private String nome;
    private int idade;
    private double peso;

    public Animal(String especie, String nome, int idade, double peso) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public void emitirSom() {
        System.out.println(nome + " está emitindo som.");
    }

    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    public void exibirInfo() {
        System.out.println("Espécie: " + especie + ", Nome: " + nome + ", Idade: " + idade + ", Peso: " + peso + "kg");
    }
}