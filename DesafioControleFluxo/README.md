# 🧮 Desafio Controle de Fluxo — Java

## 📘 Descrição

Este projeto faz parte de um exercício prático sobre **controle de fluxo em Java**, abordando o uso de **estruturas condicionais**, **laços de repetição**, **exceções customizadas** e **boas práticas de programação orientada a objetos**.

O objetivo é receber dois números inteiros via terminal, validar a relação entre eles e imprimir uma sequência incremental, respeitando as regras de negócio.

---

## 🚀 Funcionalidades

* ✅ Leitura de dois números inteiros via terminal (`Scanner`)
* ✅ Cálculo da diferença entre os parâmetros
* ✅ Impressão sequencial de números
* ✅ Lançamento de exceção customizada (`ParametrosInvalidosException`)
* ✅ Tratamento de erro com mensagem amigável
* ✅ Testes unitários (JUnit 5) cobrindo todos os fluxos possíveis

---

---

## 🧩 Estrutura do projeto

```
src/
 ├── main/java/me/dio/
 │    ├── Contador.java
 │    ├── ParametrosInvalidosException.java
 │    └── Main.java
 └── test/java/me/dio/
      └── ContadorTest.java
```

## 🧰 Como executar

### 🖥️ Via terminal

```bash
mvn clean compile exec:java -Dexec.mainClass="me.dio.Main"
```

### 💬 Exemplo de execução

```
Digite o primeiro parâmetro
12
Digite o segundo parâmetro
15
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Programa finalizado
```

---

## 🧪 Executando os testes

```bash
mvn test
```

Saída esperada:

```
[INFO] Results:
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

---

## 💡 Boas práticas aplicadas

| Prática                                               | Descrição                          |
| ----------------------------------------------------- | ---------------------------------- |
| ✅ Classe utilitária `Contador` com construtor privado | Impede instanciação indevida       |
| ✅ Exceção customizada `ParametrosInvalidosException`  | Regras de negócio encapsuladas     |
| ✅ Tratamento de exceção amigável no `Main`            | Melhora experiência do usuário     |
| ✅ Testes unitários abrangentes                        | Garantem confiabilidade            |
| ✅ Código limpo e legível                              | Fácil manutenção e extensão futura |
