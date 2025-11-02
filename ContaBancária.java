public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;
    private String tipoConta;

    public ContaBancaria(String numeroConta, String titular, double saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo restante: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void transferir(double valor, ContaBancaria destino) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para " + destino.titular + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public void exibirInfo() {
        System.out.println("Conta: " + numeroConta + ", Titular: " + titular + ", Saldo: R$" + saldo + ", Tipo: " + tipoConta);
    }
}