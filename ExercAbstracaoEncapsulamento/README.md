# 🏦 Desafio Conta Bancária — Java

## 📘 Descrição

Este projeto faz parte de um exercício prático da trilha **Java Básico (DIO)**, com foco no conceito de **encapsulamento**, além do uso de **exceções customizadas**, **regras de negócio protegidas dentro da classe**, e **boas práticas de programação orientada a objetos**.

O objetivo é simular uma conta bancária capaz de realizar operações como saque, depósito, pagamento de boleto e uso do cheque especial, sempre respeitando as validações internas e mantendo a integridade dos dados.

---

## 🚀 Funcionalidades

* ✅ Consultar saldo da conta
* ✅ Consultar limite disponível do cheque especial
* ✅ Depositar valores com validação
* ✅ Sacar valores usando ou não o cheque especial
* ✅ Pagamento de boletos com descrição
* ✅ Verificação automática de uso do cheque especial
* ✅ Lançamento de exceções customizadas:

    * `SaldoInsuficienteException`
    * `ValorInvalidoException`
* ✅ Taxação automática ao utilizar o cheque especial
* ✅ Menu interativo via terminal (`Scanner`)

---

## 🧩 Estrutura do projeto

```
src/
 ├── Main.java
 ├── Account.java
 └── br/com/forjacode/exception/
      ├── SaldoInsuficienteException.java
      └── ValorInvalidoException.java
```

---

## 🧰 Como executar

### 🖥️ Via terminal

Compile:

```bash
javac Main.java Account.java br/com/forjacode/exception/*.java
```

Execute:

```bash
java Main
```

---

## 💬 Exemplo de execução

```
=== MENU CONTA BANCÁRIA ===
1 - Consultar saldo
2 - Consultar cheque especial disponível
3 - Depositar dinheiro
4 - Sacar dinheiro
5 - Pagar boleto
6 - Verificar se está usando cheque especial
0 - Sair
Escolha uma opção: 4
Digite o valor para saque: 1200
Saque realizado com sucesso.
```

---

## 💡 Boas práticas aplicadas

| Prática                                                                          | Descrição                                            |
| -------------------------------------------------------------------------------- | ---------------------------------------------------- |
| ✅ Encapsulamento dos atributos da classe `Account`                               | Protege o estado interno da conta                    |
| ✅ Regras de negócio dentro de métodos privados                                   | Evita acesso externo indevido                        |
| ✅ Exceções customizadas (`SaldoInsuficienteException`, `ValorInvalidoException`) | Comunicação clara de erros                           |
| ✅ Validações em todas as operações                                               | Evita estados inválidos                              |
| ✅ Uso de `Scanner` com verificação de entradas                                   | Melhora a experiência do usuário                     |
| ✅ Separação clara de responsabilidades                                           | `Main` controla o menu / `Account` controla a lógica |

---
