package Firstpack.Firstpack;

/*
 * Arquivo: Main.java
 * Descrição: Classe principal corrigida para aceitar argumentos da linha de comando.
 * Observação: Se a classe Sudoku estiver no mesmo pacote (Firstpack), não é necessário usar imports.
 * Data: 2025-10-29
 */

public class Main {
    public static void main(String[] args) {
        // Cria uma instância de Sudoku (presume que exista a classe Sudoku no pacote Firstpack).
        Sudoku sudoku = new Sudoku();

        // Inicializa o tabuleiro apenas se houver argumentos fornecidos.
        if (args != null && args.length > 0) {
            sudoku.inicializarTabuleiro(args);
        } else {
            sudoku.inicializarTabuleiro(new String[0]);
        }

        System.out.println("=== JOGO DE SUDOKU ===");

        // Cria uma instância da classe interna Comandos para controlar o jogo interativo.
        Sudoku.Comandos comandos = sudoku.new Comandos();
        comandos.iniciarJogo();

        System.out.println("\\n=== JOGO FINALIZADO ===");
        sudoku.exibirTabuleiro();
    }
}
