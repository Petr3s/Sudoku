package Firstpack;/*
 * Arquivo: InterfaceSdk.java
 * Descrição: Código revisado e comentado por ChatGPT.
 * Data: 2025-10-29
 */

import javax.swing.*;

public class InterfaceSdk extends JFrame {
    public InterfaceSdk() {
        this.setTitle("Sudoku"); // Título da janela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao clicar no X
        this.setResizable(false); // Impede o usuário de redimensionar a janela

        // Adiciona o painel do jogo dentro da janela
        this.add(new InterfaceSdk());

        this.pack(); // Ajusta o tamanho da janela de acordo com o conteúdo do painel
        this.setLocationRelativeTo(null); // Centraliza a janela na tela
        this.setVisible(true); // Exibe a janela
    }

    public static void main(String[] args) {
        new InterfaceSdk(); // Cria e exibe a janela do jogo
    }
}
