public class Celular {
    private String marca;
    private String modelo;
    private int armazenamento;
    private String cor;

    public Celular(String marca, String modelo, int armazenamento, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.cor = cor;
    }

    public void ligar() {
        System.out.println(modelo + " está ligado.");
    }

    public void enviarMensagem(String msg) {
        System.out.println("Mensagem enviada: " + msg);
    }

    public void fazerChamada(String numero) {
        System.out.println("Chamando o número: " + numero);
    }

    public void tirarFoto() {
        System.out.println("Foto tirada com o " + modelo + ".");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Armazenamento: " + armazenamento + "GB, Cor: " + cor);
    }
}