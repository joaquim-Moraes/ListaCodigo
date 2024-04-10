/*  Escreva um programa que leia o código de um determinado produto e mostre a sua classificação. Utilize a tabela abaixo como referência:*/
import javax.swing.JOptionPane;
public class ListaCodigo2 {
    public static void main(String[] args) {
int codigo;
String codigo_1 = "Alimento não perecível";
String codigo_2 = "Alimento pereível";
String codigo_3 = "Vestuario";
String codigo_4 = "Limpeza";
String codigos = JOptionPane.showInputDialog("Digite o código do produto: ");
codigo = Integer.parseInt(codigos);
if(codigo == 1){
    JOptionPane.showMessageDialog(null,codigo_1);
}else if (codigo == 2) {
    JOptionPane.showMessageDialog(null, codigo_2);
}else if (codigo == 3){
    JOptionPane.showMessageDialog(null,codigo_3);
}else if (codigo == 4){
    JOptionPane.showMessageDialog(null,codigo_4);
}
}
}





