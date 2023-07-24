import javax.swing.*;

public class PrimeiraClasseJava {
    public static void main(String[] args) {
       String carros = JOptionPane.showInputDialog(" informe a quantidade de carros");
        String pessoas = JOptionPane.showInputDialog(" informe a quantidade de pessoas");
        double carroNumeros = Double.parseDouble(carros);
        double pessoaNumeros = Double.parseDouble(pessoas);

        int divisao = (int)  (carroNumeros/ pessoaNumeros) ;
        double resto = carroNumeros%pessoaNumeros;


        JOptionPane.showMessageDialog(null,"Divisao para pessoas deu " + divisao +" carros e sobrou "+ resto + " carros " );




    }
}
