package me.dio;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ContadorTest {

    @Test
    @DisplayName("Deve imprimir sequência de números quando parametroUm for menor que parametroDois")
    void testContarComParametrosValidos() throws Exception {
        int parametroUm = 12;
        int parametroDois = 30;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(out));
            Contador.contar(parametroUm, parametroDois);
        } finally {
            System.setOut(originalOut);
        }

        String output = out.toString().trim();
        String[] lines = output.isEmpty() ? new String[0] : output.split("\\r?\\n");

        assertEquals(18, lines.length);
        assertEquals("Imprimindo o número 1", lines[0]);
        assertEquals("Imprimindo o número 2", lines[1]);
        assertEquals("Imprimindo o número 3", lines[2]);
    }

    @Test
    @DisplayName("Deve lançar ParametrosInvalidosException quando o primeiro parâmetro for maior")
    void testContarComPrimeiroMaiorLancaExcecao() {
        int parametroUm = 30;
        int parametroDois = 12;

        ParametrosInvalidosException ex = assertThrows(ParametrosInvalidosException.class,
                () -> Contador.contar(parametroUm, parametroDois));

        assertTrue(ex.getMessage().contains("O segundo parâmetro deve ser maior que o primeiro"));
    }

    @Test
    @DisplayName("Não deve imprimir nada quando os parâmetros forem iguais")
    void testContarComParametrosIguais() throws Exception {
        int parametroUm = 12;
        int parametroDois = 12;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(out));
            Contador.contar(parametroUm, parametroDois); // contagem = 0 -> sem saída
        } finally {
            System.setOut(originalOut);
        }

        assertTrue(out.toString().trim().isEmpty());
    }

    @Test
    @DisplayName("Deve funcionar normalmente com números negativos")
    void testComNumerosNegativos() throws Exception {
        int parametroUm = -2;
        int parametroDois = 1;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Contador.contar(parametroUm, parametroDois);
        System.setOut(System.out);

        assertEquals(3, out.toString().trim().split("\\r?\\n").length);
    }

    @Test
    @DisplayName("Deve imprimir apenas uma vez quando diferença for 1")
    void testContarDiferencaUm() throws Exception {
        int parametroUm = 5;
        int parametroDois = 6;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Contador.contar(parametroUm, parametroDois);
        System.setOut(System.out);

        assertEquals("Imprimindo o número 1", out.toString().trim());
    }
}