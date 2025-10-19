import javax.swing.JOptionPane;

public class CalculadoraSimples {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                String input1 = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
                if (input1 == null) {
                    System.exit(0);
                }
                num1 = Double.parseDouble(input1);
                entradaValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        entradaValida = false;

        while (!entradaValida) {
            try {
                String input2 = JOptionPane.showInputDialog(null, "Digite o segundo número:");
                if (input2 == null) {
                    System.exit(0);
                }
                num2 = Double.parseDouble(input2);
                entradaValida = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        String[] opcoes = {"+", "-", "/", "÷"};
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a operação:",
            "Calculadora",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        if (escolha == JOptionPane.CLOSED_OPTION) { // Usuário fechou
            System.exit(0);
        }

        double resultado = 0;
        String operacao = opcoes[escolha];
        boolean operacaoValida = true;

        switch (escolha) {
            case 0: // +
                resultado = num1 + num2;
                break;
            case 1: // -
                resultado = num1 - num2;
                break;
            case 2: // ×
                resultado = num1 * num2;
                break;
            case 3: // ÷
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                    operacaoValida = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
        }

        if (operacaoValida) {
            JOptionPane.showMessageDialog(null, "Resultado: " + num1 + " " + operacao + " " + num2 + " = " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}