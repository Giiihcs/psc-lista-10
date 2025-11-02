public class Casa {
    private String endereco;
    private int comodos;
    private String cor;
    private double tamanho;

    public Casa(String endereco, int comodos, String cor, double tamanho) {
        this.endereco = endereco;
        this.comodos = comodos;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void abrirPorta() {
        System.out.println("Porta da casa foi aberta.");
    }

    public void fecharJanela() {
        System.out.println("Janela da casa foi fechada.");
    }

    public void ligarLuz() {
        System.out.println("Luzes da casa foram acesas.");
    }

    public void receberVisitas() {
        System.out.println("A casa está recebendo visitas.");
    }

    public void exibirInfo() {
        System.out.println("Endereço: " + endereco + ", Cômodos: " + comodos + ", Cor: " + cor + ", Tamanho: " + tamanho + "m²");
    }
}