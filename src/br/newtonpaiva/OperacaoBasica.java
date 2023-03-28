package br.newtonpaiva;
import javax.swing.*;
public class OperacaoBasica {
    double numero1;
    double numero2;
    double resultado;
    public OperacaoBasica(){
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
    }
    public void soma(){
        numero1 =
                Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        numero2 =
                Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        resultado = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "O resultado é " +
                resultado);
    }
    public void subtracao(){
        numero1 =
                Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        numero2 =
                Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        resultado = numero1 - numero2;
        JOptionPane.showMessageDialog(null, "O resultado é " +
                resultado);
    }
    public void divisao(){
        numero1 =
                Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        numero2 =
                Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        resultado = numero1 / numero2;
        JOptionPane.showMessageDialog(null, "O resultado é " +
                resultado);
    }
    public void multiplicacao(){
        numero1=
                Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        numero2 =
                Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        resultado = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "O resultado é: " +
                resultado);
    }
}