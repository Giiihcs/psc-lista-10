public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Giovanna Silva", 20, "123.456.789-00", "giovanna@email.com");
        Animal a = new Animal("Cachorro", "Rex", 3, 12.5);
        Carro c = new Carro("Toyota", "Corolla", 2020, "Prata");
        Escola e = new Escola("Escola Sol Nascente", "Rua das Flores, 123", 20, "Maria Santos");
        Computador comp = new Computador("Intel i5", 16, 512, "Windows 11");
        Celular cel = new Celular("Apple", "iPhone 14", 128, "Roxo");
        Casa casa = new Casa("Av. Brasil, 456", 5, "Branca", 120.5);
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 256, "Romance");
        ContaBancaria conta = new ContaBancaria("12345-6", "Giovanna Silva", 1500.0, "Corrente");
        Aviao av = new Aviao("Boeing 737", "Gol", 180, 5000);

        System.out.println("=== Testando Classes ===");
        p.exibirInfo(); p.falar("Olá!"); System.out.println();
        a.exibirInfo(); a.comer(); System.out.println();
        c.exibirInfo(); c.acelerar(); System.out.println();
        e.exibirInfo(); e.realizarAulas(); System.out.println();
        comp.exibirInfo(); comp.executarPrograma("Word"); System.out.println();
        cel.exibirInfo(); cel.fazerChamada("99999-9999"); System.out.println();
        casa.exibirInfo(); casa.receberVisitas(); System.out.println();
        livro.exibirInfo(); livro.ler(); System.out.println();
        conta.exibirInfo(); conta.depositar(200); System.out.println();
        av.exibirInfo(); av.voar();
    }
}