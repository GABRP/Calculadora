package br.newtonpaiva;
import javax.swing.*;
public class Menu {
    static int opcao;
    static String menu;
    public static void main(String[] args) {
        OperacaoBasica object = new OperacaoBasica();
        do {
            menu = JOptionPane.showInputDialog("Interface da Calculadora:\n" + "1. Soma\n" + "2. Subtração\n" + "3. Divisão\n" + "4 Multiplicação\n" + "5. Sair");
            opcao = Integer.parseInt(menu);
            switch (opcao){
                case 1:
                    object.soma();
                    break;
                case 2:
                    object.subtracao();
                    break;
                case 3:
                    object.divisao();
                    break;
                case 4:
                    object.multiplicacao();
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção " +
                            opcao + " está incorreto");
            }
        }while(opcao != 5);
    }
}
