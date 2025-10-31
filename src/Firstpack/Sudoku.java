package Firstpack;

import java.util.Scanner;

/*
 * Arquivo: Sudoku.java
 * Descrição: Implementação básica da lógica do jogo Sudoku necessária para o Main.
 *            Contém:
 *            - tabuleiro 9x9
 *            - inicializarTabuleiro(String[] args)
 *            - exibirTabuleiro()
 *            - gerarNovoJogo() (gera tabuleiro vazio ou exemplo)
 *            - classe interna Comandos com iniciarJogo()
 *
 * Observação: esta é uma versão simples para você começar. Dá para expandir:
 * - validações de regras (linha/coluna/quadrante)
 * - geração/resolução automática
 * - salvar/carregar de arquivo
 *
 * Data: 2025-10-29
 */

public class Sudoku {
    private int[][] tabuleiro = new int[9][9];

    public Sudoku() {
        // Inicializa com zeros (vazio)
        zerarTabuleiro();
    }

    private void zerarTabuleiro() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tabuleiro[i][j] = 0;
            }
        }
    }

    /**
     * Inicializa o tabuleiro.
     * Se args tiver um argumento e for uma string com 81 dígitos (0 para vazio),
     * preenche com esses valores. Caso contrário, gera um novo jogo vazio.
     *
     * Exemplos de uso:
     * - nenhum argumento: gera tabuleiro vazio
     * - args[0] = "000000000... (81 chars)" : carrega esse tabuleiro
     */
    public void inicializarTabuleiro(String[] args) {
        if (args != null && args.length > 0 && args[0] != null) {
            String s = args[0].trim();
            if (s.length() == 81 && s.matches("[0-9]+")) {
                int idx = 0;
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        tabuleiro[i][j] = Character.getNumericValue(s.charAt(idx++));
                    }
                }
                System.out.println("Tabuleiro carregado a partir de args.");
                return;
            } else {
                System.out.println("Args inválido para carregar tabuleiro (esperado 81 dígitos). Gerando tabuleiro vazio.");
            }
        }
        gerarNovoJogo();
    }

    /**
     * Gera um novo jogo. Aqui só zera (vazio) como exemplo.
     * Você pode alterar para gerar um puzzle real.
     */
    public void gerarNovoJogo() {
        zerarTabuleiro();
        // Exemplo: preenche alguns números para visualizar (opcional)
        tabuleiro[0][0] = 5;
        tabuleiro[0][1] = 3;
        tabuleiro[1][0] = 6;
        // ... você pode adicionar mais valores exemplo ou gerar aleatório
        System.out.println("Tabuleiro gerado (exemplo simples).");
    }

    /**
     * Exibe o tabuleiro no console de forma legível.
     */
    public void exibirTabuleiro() {
        System.out.println("   1 2 3   4 5 6   7 8 9");
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println(" +-------+-------+-------+");
            }
            System.out.print((i + 1) + "| ");
            for (int j = 0; j < 9; j++) {
                int val = tabuleiro[i][j];
                System.out.print((val == 0 ? "." : val) + " ");
                if ((j + 1) % 3 == 0) System.out.print("| ");
            }
            System.out.println();
        }
        System.out.println(" +-------+-------+-------+");
    }

    /**
     * Tenta colocar um valor no tabuleiro sem fazer validação de regras completas.
     * Retorna true se pôde colocar, false caso contrário (por ex. posição inválida).
     */
    public boolean colocarValor(int linha, int coluna, int valor) {
        if (linha < 0 || linha >= 9 || coluna < 0 || coluna >= 9) return false;
        if (valor < 0 || valor > 9) return false;
        tabuleiro[linha][coluna] = valor;
        return true;
    }

    /**
     * Classe interna para controlar interações simples com o usuário.
     * O método iniciarJogo abre um loop no console aceitando comandos básicos:
     * - colocar: "r c v" (ex: "1 3 9") para linha, coluna, valor
     * - mostrar: "m" para exibir o tabuleiro
     * - sair: "s" para encerrar
     *
     * Você pode adaptar para a interface gráfica depois.
     */
    public class Comandos {
        private final Scanner scanner = new Scanner(System.in);

        public void iniciarJogo() {
            System.out.println("Iniciando modo interativo (console).");
            exibirTabuleiro();
            while (true) {
                System.out.println("Comandos: [r c v] colocar | m mostrar | s sair");
                System.out.print("> ");
                String linha = scanner.nextLine().trim();
                if (linha.equalsIgnoreCase("s") || linha.equalsIgnoreCase("sair")) {
                    System.out.println("Saindo do modo interativo.");
                    break;
                }
                if (linha.equalsIgnoreCase("m") || linha.equalsIgnoreCase("mostrar")) {
                    exibirTabuleiro();
                    continue;
                }
                // Tenta ler três inteiros
                String[] parts = linha.split("\\s+");
                if (parts.length == 3) {
                    try {
                        int r = Integer.parseInt(parts[0]);
                        int c = Integer.parseInt(parts[1]);
                        int v = Integer.parseInt(parts[2]);
                        // converte para índices 0-based
                        boolean ok = colocarValor(r - 1, c - 1, v);
                        if (!ok) {
                            System.out.println("Entrada inválida. Use números entre 1-9 para linhas/colunas e 0-9 para valor (0 = apagar).");
                        } else {
                            System.out.println("Valor definido.");
                            exibirTabuleiro();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: entrada deve ser três números separados por espaço (ex: 1 3 9).");
                    }
                } else {
                    System.out.println("Comando não reconhecido.");
                }
            }
        }
    }
}
