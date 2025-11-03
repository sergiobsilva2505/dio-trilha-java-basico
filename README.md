# ☕ Trilha Java Básico — DIO

## 📘 Sobre a trilha

Este repositório reúne todos os projetos desenvolvidos durante a **Trilha Java Básico da [Digital Innovation One (DIO)](https://www.dio.me)**.
O objetivo é consolidar o aprendizado de **sintaxe Java, controle de fluxo, POO (Programação Orientada a Objetos)** e outras bases da linguagem, através de pequenos projetos práticos e incrementais.

Cada módulo contém um exercício completo, com código comentado, boas práticas aplicadas e, em alguns casos, **testes automatizados com JUnit**.

---

## 📂 Estrutura do repositório

```
dio-trilha-java-basico/
├── conta-terminal/
│   ├── src/
│   └── README.md
├── desafio-controle-fluxo/
│   ├── src/
│   └── README.md
└── (novos projetos serão adicionados futuramente)
```

---

## 🧱 Projetos já concluídos

### 🔹 1. [Conta Terminal](./conta-terminal/README.md)

**Módulo:** Sintaxe Java Básico
**Descrição:**
Simula a criação de uma conta bancária via terminal.
O usuário informa número, agência, nome e saldo, e o sistema exibe uma mensagem personalizada.

**Conceitos aplicados:**

* Entrada de dados com `Scanner`
* Tipos primitivos e `String`
* Construtores e encapsulamento
* `System.out.printf` para formatação de saída

**Exemplo de execução:**

```
Por favor, digite o número da conta!
1021
Por favor, digite o número da agência!
067-8
Por favor, digite o nome do cliente!
MARIO ANDRADE
Por favor, digite o saldo da conta!
237.48
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo R$ 237.48 já está disponível para saque.
```

---

### 🔹 2. [Desafio Controle de Fluxo](./desafio-controle-fluxo/README.md)

**Módulo:** Controle de Fluxo
**Descrição:**
Recebe dois números inteiros e imprime uma sequência incremental com base na diferença entre eles.
Lança uma exceção customizada (`ParametrosInvalidosException`) se o primeiro número for maior que o segundo.

**Conceitos aplicados:**

* Estruturas de decisão (`if/else`)
* Laço `for`
* Exceções personalizadas (`extends Exception`)
* Classe utilitária com método estático
* Testes automatizados com **JUnit 5**

**Exemplo de execução:**

```
Digite o primeiro parâmetro:
12
Digite o segundo parâmetro:
15
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Programa finalizado
```

---

## 🧩 Próximos módulos (em desenvolvimento)

| Módulo                     | Projeto     | Status |
| -------------------------- | ----------- | ------ |
| 🔸 Estruturas de Repetição | Em breve... | 🕓     |
| 🔸 Estruturas de Dados     | Em breve... | 🕓     |
| 🔸 Desafio POO             | Em breve... | 🕓     |
| 🔸 API e Testes            | Em breve... | 🕓     |

*(Os novos projetos seguirão o mesmo padrão de organização e documentação dos atuais.)*

---

## ⚙️ Requisitos para executar os projetos

* ☕ **Java 17+** instalado
* 🧰 (Opcional) **Maven 3.9+** — caso queira rodar via `mvn exec:java`
* 💻 Terminal / IDE de sua preferência (IntelliJ, VS Code, Eclipse, etc.)

---

## 🧪 Execução via terminal

### Compilar:

```bash
javac me/dio/*.java
```

### Executar:

```bash
java me.dio.BancoApp
```

ou, no projeto de controle de fluxo:

```bash
java me.dio.Main
```

---

## 🧱 Boas práticas aplicadas em todos os projetos

| Prática                          | Descrição                                       |
| -------------------------------- | ----------------------------------------------- |
| ✅ Encapsulamento                 | Atributos privados e acesso via getters/setters |
| ✅ Separação de responsabilidades | Cada classe tem uma única função clara          |
| ✅ Código limpo                   | Nomeação clara e padronizada                    |
| ✅ Comentários essenciais         | Código autoexplicativo e bem documentado        |
| ✅ Testes automatizados           | Garantem a qualidade e evitam regressões        |

---

## 👨‍💻 Autor

**Sérgio Bezerra da Silva**
📍 Desenvolvedor Java
📫 [LinkedIn](https://www.linkedin.com/in/sergio-bezerra-da-silva-programador-desenvolvedor/) | [GitHub](https://github.com/sergiobsilva2505)
