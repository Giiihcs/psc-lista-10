public class Computador {
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private String sistemaOperacional;

    public Computador(String processador, int memoriaRAM, int armazenamento, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar() {
        System.out.println("Computador está ligando...");
    }

    public void desligar() {
        System.out.println("Computador está desligando...");
    }

    public void processarDados() {
        System.out.println("Computador está processando dados...");
    }

    public void executarPrograma(String programa) {
        System.out.println("Executando o programa: " + programa);
    }

    public void exibirInfo() {
        System.out.println("Processador: " + processador + ", RAM: " + memoriaRAM + "GB, Armazenamento: " + armazenamento + "GB, SO: " + sistemaOperacional);
    }
}