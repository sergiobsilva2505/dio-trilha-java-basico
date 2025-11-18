package br.com.forjacode;

import br.com.forjacode.exception.SaldoInsuficienteException;
import br.com.forjacode.exception.ValorInvalidoException;

public class Account {

    private Integer number;
    private String bankBranch;
    private String user;
    private Double balance;
    private Double overdraft;

    public Account(Integer number, String bankBranch, String user, Double balance) {
        this.number = number;
        this.bankBranch = bankBranch;
        this.user = user;
        this.balance = balance;
        this.overdraft = definirChequeEspecial(balance);
    }

    public void sacar(Double valor) {
        if (valor == null || valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque.");
        }

        double limiteTotal = this.balance + this.overdraft;

        if (valor > limiteTotal) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }

        if (valor <= this.balance) {
            this.balance -= valor;
            return;
        }

        double restante = valor - this.balance;
        this.balance = 0.0;

        this.overdraft -= restante;
        taxarChequeEspecial();
    }

    private Double definirChequeEspecial(Double saldo) {
        return saldo <= 500.0 ? 50.0 : saldo * 0.2;
    }

    private void taxarChequeEspecial() {
        if (this.overdraft > 0) {
            this.overdraft -= this.overdraft * 0.2;
        }
    }

    public Integer getNumber() {
        return number;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public String getUser() {
        return user;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getSaldoTotal() {
        return this.balance + this.overdraft;
    }

    public Double getOverdraft() {
        return overdraft;
    }

    public void deposit(double deposito) {
        if (deposito <= 0) {
            throw new ValorInvalidoException("Valor inválido para depósito");
        }
        this.balance += deposito;
    }

    public boolean isUsingOverdraft() {
        return this.overdraft < definirChequeEspecial(this.balance);
    }

    public void payBill(double valorBoleto, String descricao) {
        if (valorBoleto <= 0) {
            throw new ValorInvalidoException("Valor inválido para pagamento de boleto");
        }
        sacar(valorBoleto);
        System.out.printf("Boleto '%s' pago com sucesso no valor de R$ %.2f%n", descricao, valorBoleto);

    }
}
