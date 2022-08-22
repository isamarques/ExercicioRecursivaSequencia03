package view;

import controller.Sequencia;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		Sequencia ordem = new Sequencia();
		double divisor = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro para validar a sequência: "));
		double resultado = ordem.seq(divisor);
		
		System.out.println(resultado);

	}
	
}
