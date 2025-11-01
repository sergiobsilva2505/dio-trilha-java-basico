package me.dio;

public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeDoCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeDoCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeDoCliente = nomeDoCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n",
                nomeDoCliente, agencia, numero, saldo);
    }
}
