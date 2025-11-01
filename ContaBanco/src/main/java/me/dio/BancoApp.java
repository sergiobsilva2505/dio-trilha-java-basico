package me.dio;

import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numero = input.nextInt();
        input.nextLine();

        System.out.println("Por favor, digite o numero da agencia!");
        String agencia = input.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeDoCliente = input.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = input.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeDoCliente, saldo);
        conta.exibirInformacoes();

        input.close();
    }
}
