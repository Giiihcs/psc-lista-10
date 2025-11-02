public class Aviao {
    private String modelo;
    private String companhia;
    private int capacidade;
    private int autonomia;

    public Aviao(String modelo, String companhia, int capacidade, int autonomia) {
        this.modelo = modelo;
        this.companhia = companhia;
        this.capacidade = capacidade;
        this.autonomia = autonomia;
    }

    public void decolar() {
        System.out.println(modelo + " está decolando!");
    }

    public void voar() {
        System.out.println(modelo + " está voando.");
    }

    public void pousar() {
        System.out.println(modelo + " está pousando.");
    }

    public void desembarcarPassageiros() {
        System.out.println("Passageiros estão desembarcando do " + modelo + ".");
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Companhia: " + companhia + ", Capacidade: " + capacidade + ", Autonomia: " + autonomia + "km");
    }
}