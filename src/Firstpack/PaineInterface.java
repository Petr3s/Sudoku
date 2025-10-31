package Firstpack;/*
 * Arquivo: PaineInterface.java
 * Descrição: Código revisado e comentado por ChatGPT.
 * Data: 2025-10-29
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaineInterface extends JFrame {
    private JButton startButton;
    private JButton exitButton;
    private JLabel titleLabel;
    private JPanel mainPanel;

    public PaineInterface() {
        // Configurações da janela principal
        setTitle("Sudoku Petres");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Cria o painel principal com layout vertical
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.DARK_GRAY);

        // Título do jogo
        titleLabel = new JLabel("Bem-vindo ao Jogo de Sudoku do Petres!");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Botão Iniciar
        startButton = new JButton("Iniciar Jogo");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarJogo();
            }
        });

        // Botão Sair (ainda não funcional, será implementado depois)
        exitButton = new JButton("Sair");
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Fecha o programa
            }
        });

        // Adiciona espaçamento vertical entre os componentes
        mainPanel.add(Box.createVerticalStrut(30)); // Espaço no topo
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(30)); // Espaço entre título e botões
        mainPanel.add(startButton);
        mainPanel.add(Box.createVerticalStrut(15)); // Espaço entre botões
        mainPanel.add(exitButton);
        mainPanel.add(Box.createVerticalStrut(30)); // Espaço no fundo

        // Adiciona o painel principal à janela
        add(mainPanel);

        // Torna a janela visível
        setVisible(true);
    }

    // Método chamado ao clicar em "Iniciar Jogo"
    private void iniciarJogo() {
        JOptionPane.showMessageDialog(this, "Jogo iniciado!");
        // Aqui você pode abrir outra tela, iniciar o jogo, etc.
    }

    // Método main para testar a interface
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PaineInterface());
    }
}