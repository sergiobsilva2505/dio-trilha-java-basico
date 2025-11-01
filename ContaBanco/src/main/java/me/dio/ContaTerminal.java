package me.dio;

import java.util.Scanner;

public class ContaTerminal {
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
        Double saldo = input.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n", nomeDoCliente, agencia, numero, saldo);

        input.close();
    }
}
