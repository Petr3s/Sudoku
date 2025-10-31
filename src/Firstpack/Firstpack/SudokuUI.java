package Firstpack.Firstpack;

import javax.swing.*;
import java.awt.*;

public class SudokuUI extends JFrame {
    private final JTextField[][] campos = new JTextField[9][9];
    private final Sudoku sudoku;

    public SudokuUI() {
        sudoku = new Sudoku();
        sudoku.gerarNovoJogo();

        setTitle("Sudoku Simples");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        // Painel central (grade 9x9)
        JPanel painelGrade = new JPanel(new GridLayout(9, 9));
        painelGrade.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JTextField campo = new JTextField(1);
                campo.setHorizontalAlignment(JTextField.CENTER);
                campo.setFont(new Font("Arial", Font.BOLD, 18));

                // Pequeno destaque nos blocos 3x3
                if ((i / 3 + j / 3) % 2 == 0) {
                    campo.setBackground(new Color(240, 240, 240));
                }

                campos[i][j] = campo;
                painelGrade.add(campo);
            }
        }

        // Painel inferior (botões)
        JPanel painelBotoes = new JPanel();
        JButton btnMostrar = new JButton("Ver Tabuleiro");
        JButton btnNovo = new JButton("Novo Jogo");
        JButton btnSair = new JButton("Sair");

        painelBotoes.add(btnMostrar);
        painelBotoes.add(btnNovo);
        painelBotoes.add(btnSair);

        // Adiciona os painéis à janela
        add(painelGrade, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        // Ações dos botões
        btnMostrar.addActionListener(e -> sudoku.exibirTabuleiro());
        btnNovo.addActionListener(e -> limparCampos());
        btnSair.addActionListener(e -> System.exit(0));

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void limparCampos() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                campos[i][j].setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SudokuUI::new);
    }
}
