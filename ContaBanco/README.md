# 🏦 Projeto Conta Terminal — Java

## 📘 Descrição

Este projeto faz parte do módulo **Sintaxe — Trilha Java Básico **.
O objetivo é exercitar a leitura de dados via terminal, o uso de variáveis, a formatação de saída e o encapsulamento de atributos em uma classe orientada a objetos.

A aplicação simula a criação de uma conta bancária simples, solicitando ao usuário as informações necessárias e exibindo uma mensagem personalizada com os dados da conta criada.

---

## 🚀 Funcionalidades

* ✅ Leitura de dados via `Scanner` (número, agência, nome e saldo)
* ✅ Criação de um objeto `ContaTerminal` com os valores informados
* ✅ Exibição formatada das informações no console
* ✅ Uso de **encapsulamento**, **construtor** e **método de comportamento** (`exibirInformacoes()`)
* ✅ Estrutura limpa e orientada a objetos

---

## 🧠 Estrutura do projeto

```
src/
 └── main/java/me/dio/
      ├── ContaTerminal.java
      └── BancoApp.java
```

---

## 🧮 Exemplo de execução

**Entrada (usuário):**

```
Por favor, digite o número da conta!
1021
Por favor, digite o número da agência!
067-8
Por favor, digite o nome do cliente!
MARIO ANDRADE
Por favor, digite o saldo da conta!
237.48
```

**Saída (console):**

```
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo R$ 237.48 já está disponível para saque.
```

---

## 🧰 Como executar

### 🖥️ Compilação e execução via terminal

Dentro da pasta do projeto (onde estão os arquivos `.java`):

```bash
javac me/dio/*.java
java me.dio.BancoApp
```
---

## 💡 Possíveis melhorias

| Tipo                        | Descrição                                                                                  |
| --------------------------- | ------------------------------------------------------------------------------------------ |
| 🧱 **Imutabilidade**        | Tornar a classe `ContaTerminal` imutável (removendo setters e tornando atributos `final`). |
| 🧮 **Validação**            | Validar dados no construtor (número positivo, saldo não negativo, etc.).                   |
| 🎨 **Interface**            | Melhorar o layout do console (linhas separadoras ou títulos).                              |
| 🧪 **Testes automatizados** | Criar testes unitários para o método `exibirInformacoes()`.                                |

---

## 🧱 Boas práticas aplicadas

| Prática                       | Descrição                                                        |
| ----------------------------- | ---------------------------------------------------------------- |
| ✅ **Encapsulamento**          | Atributos privados e acesso via getters/setters                  |
| ✅ **Responsabilidade única**  | `ContaTerminal` representa o domínio; `BancoApp` faz a interação |
| ✅ **Código limpo**            | Variáveis e métodos com nomes intuitivos                         |
| ✅ **Formatação profissional** | Uso de `printf` com duas casas decimais                          |
| ✅ **Fechamento de recursos**  | `Scanner` fechado ao final                                       |

---