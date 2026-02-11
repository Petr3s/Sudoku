🧩 Sudoku em Java (Interface Gráfica)

Projeto desenvolvido em Java com interface gráfica para jogar e validar partidas de Sudoku.

O sistema permite interação visual com o tabuleiro 9x9, aplicando as regras clássicas do jogo:

Cada linha deve conter números de 1 a 9 sem repetição

Cada coluna deve conter números de 1 a 9 sem repetição

Cada subgrade 3x3 deve conter números de 1 a 9 sem repetição

🚀 Tecnologias Utilizadas

Java

Java Swing (Interface gráfica)

Programação Orientada a Objetos

📁 Estrutura do Projeto
src/
 └── Firstpack/
      ├── Main.java
      ├── Sudoku.java
      ├── Tabuleiro.java
      ├── SudokuUI.java
      ├── PainelInterface.java
      └── InterfaceSdk.java

📌 Responsabilidade das Classes

Main.java → Classe de inicialização da aplicação.

Sudoku.java → Regras principais do jogo.

Tabuleiro.java → Estrutura e controle da matriz 9x9.

SudokuUI.java → Gerenciamento da interface gráfica.

PainelInterface.java → Componentes visuais do tabuleiro.

InterfaceSdk.java → Contrato (interface) com métodos principais do jogo.

Essa separação demonstra aplicação de conceitos de:

Encapsulamento

Separação de responsabilidades

Uso de interface para abstração

▶️ Como Executar

Clone o repositório:

git clone https://github.com/Petr3s/Sudoku.git


Abra o projeto em uma IDE (IntelliJ, Eclipse ou VS Code)

Execute a classe:

Main.java

🧠 Conceitos Aplicados

Programação Orientada a Objetos

Organização em pacotes

Separação entre lógica e interface

Manipulação de eventos com Swing

Estruturação de projeto desktop

📌 Melhorias Futuras

Implementação de algoritmo automático de resolução (Backtracking)

Sistema de níveis de dificuldade

Validação em tempo real

Refatoração para padrão MVC

Implementação de testes unitários


🎯 Objetivo do Projeto

Praticar conceitos de Java e desenvolvimento desktop, aplicando boas práticas de organização e estruturação de código.
