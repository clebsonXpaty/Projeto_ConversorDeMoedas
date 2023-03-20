package conversor_de_moedas_programaOneNextEducation;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ConverteMoeda {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		//JButton jButton = new JButton("Enviar");
		
		janela.setTitle("Auala1");
		janela.setVisible(true);
		janela.setSize(1300,1000);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().setBackground(new Color(135,200,200));
		Converte converte = new Converte();
		try {
			 converte.calcula("");
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					  "Digite um número!");
			converte.calcula(null);
		}
		
		JOptionPane.showConfirmDialog(null, "Deseja ver converter a temperatura de celsos para  fahrenheit?");
		
		
		
	
}
}
	
