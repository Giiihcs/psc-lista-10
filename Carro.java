public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void ligar() {
        System.out.println(modelo + " está ligado.");
    }

    public void acelerar() {
        System.out.println(modelo + " está acelerando.");
    }

    public void frear() {
        System.out.println(modelo + " está freando.");
    }

    public void desligar() {
        System.out.println(modelo + " está desligado.");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor);
    }
}