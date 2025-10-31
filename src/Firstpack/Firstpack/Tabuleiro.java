// src/main/Firstpack/Tabuleiro.java
package Firstpack.Firstpack;

public class Tabuleiro {
    public static class Sudoku {
        private int[][] board = new int[9][9];

        public void inicializarTabuleiro(String[] args) {
            // Lógica de inicialização aqui
        }

        public void exibirTabuleiro() {
            for (int[] row : board) {
                for (int cell : row) {
                    System.out.print((cell == 0 ? "." : cell) + " ");
                }
                System.out.println();
            }
        }

        public class Comandos {
            public void iniciarJogo() {
                System.out.println("Jogo interativo no terminal (implemente aqui)");
            }
        }
    }
}