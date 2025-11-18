package br.com.forjacode;

import br.com.forjacode.exception.SaldoInsuficienteException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(12345, "0001", "João Silva", 1000.0);

        int option;

        do {
            System.out.println("\n=== MENU CONTA BANCÁRIA ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial disponível");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Opção inválida. Digite um número: ");
                scanner.next();
            }

            option = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (option) {
                    case 1:
                        System.out.printf("Saldo atual: R$ %.2f%n", account.getBalance());
                        break;

                    case 2:
                        System.out.printf("Cheque especial disponível: R$ %.2f%n", account.getOverdraft());
                        break;

                    case 3:
                        System.out.print("Digite o valor para depósito: ");
                        double deposito = scanner.nextDouble();
                        scanner.nextLine();
                        account.deposit(deposito);
                        System.out.println("Depósito realizado com sucesso.");
                        System.out.println("Novo saldo: R$ " + account.getBalance());
                        break;

                    case 4:
                        System.out.print("Digite o valor para saque: ");
                        double saque = scanner.nextDouble();
                        scanner.nextLine();
                        account.sacar(saque);
                        System.out.println("Saque realizado com sucesso.");
                        break;

                    case 5:
                        System.out.print("Digite o valor do boleto: ");
                        double valorBoleto = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Digite a descrição do boleto: ");
                        String descricao = scanner.nextLine();
                        account.payBill(valorBoleto, descricao);
                        break;

                    case 6:
                        if (account.isUsingOverdraft()) {
                            System.out.println("A conta está usando cheque especial.");
                        } else {
                            System.out.println("A conta NÃO está usando cheque especial.");
                        }
                        break;

                    case 0:
                        System.out.println("Encerrando o programa. Até mais!");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (SaldoInsuficienteException | IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (option != 0);

    }
}