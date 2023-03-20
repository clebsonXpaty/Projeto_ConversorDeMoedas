package conversor_de_moedas_programaOneNextEducation;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Converte extends RuntimeException {

	/*
	 * public void calculaValorDoReal() { String real; real
	 * =JOptionPane.showInputDialog(null,
	 * "Informe o valor em reais para conversão!"); calcula() ; }
	 */

	private String moeda;
	private String real;

	public void calcula(String converteOpcao) {

		this.moeda = converteOpcao;
		converteOpcao = JOptionPane.showInputDialog(null,
				"Digite um número/opção" + "\n1 Converte Real x Euro" + "\n2 Converte Real x  Dólar"
						+ "\n3 Converte real x Libra Esterlina" + "\n4 Converte Euro  x Real"
						+ "\n5 Converte Dólar x Real " + "\n6 Converte Libra Esterlina x Real");
		
		 
		 
		int opcao = Integer.parseInt(converteOpcao);

		if (opcao == 1) {

			this.real = JOptionPane.showInputDialog(null, "Informe o valor em reais para conversão!");

			double valorReal = Double.parseDouble(this.real);
			final double cotacaoDoEuro = 5.601;
			double valorConvertido;
			valorConvertido = valorReal / cotacaoDoEuro;
			JOptionPane.showMessageDialog(null,
					"Vocẽ tem = " + new DecimalFormat().format(valorConvertido) + "€  em Euros");
		}

		if (opcao == 2) {

			this.real = JOptionPane.showInputDialog(null, "Informe o valor em reais para conversão!");
			double valorReal = Double.parseDouble(this.real);
			final double cotacaoDoDolar = 5.224;
			double valorConvertido;
			valorConvertido = valorReal / cotacaoDoDolar;
			JOptionPane.showMessageDialog(null,
					"Vocẽ tem:" + new DecimalFormat(".##").format(valorConvertido) + "US$ em Dólar");
		}

		if (opcao == 3) {

			this.real = JOptionPane.showInputDialog(null, "Informe o valor em reais para conversão!");
			double valorReal = Double.parseDouble(this.real);
			final double cotacaoDaLibra = 6.346;
			double valorConvertido;
			valorConvertido = valorReal / cotacaoDaLibra;
			JOptionPane.showMessageDialog(null,
					"Você tem :" + new DecimalFormat().format(valorConvertido) + "£ em LibrasEsterlinas");
		}

		if (opcao == 4) {

			this.real = JOptionPane.showInputDialog(null, "Informe o valor em euro para conversão!");
			double valorReal = Double.parseDouble(this.real);
			final double euro = 5.601;
			double valorConvertido;
			valorConvertido = valorReal * euro;
			JOptionPane.showMessageDialog(null,
					"Você tem :" + new DecimalFormat().format(valorConvertido) + " R$ em Reais!");
		}

		if (opcao == 5) {

			this.real = JOptionPane.showInputDialog(null, "Informe o valor em dólar para conversão!");
			double valorReal = Double.parseDouble(this.real);
			final double cotacaoDoDolar = 5.224;
			double valorConvertido;
			valorConvertido = valorReal * cotacaoDoDolar;
			JOptionPane.showMessageDialog(null,
					"Você tem :" + new DecimalFormat().format(valorConvertido) + " R$ em Reais!");
		}

		if (opcao == 6) {

			this.real = JOptionPane.showInputDialog(null, "Informe o valor em Libra Esterlina para conversão!");
			double valorReal = Double.parseDouble(this.real);
			final double cotacaoDaLibra = 6.346;
			double valorConvertido;
			valorConvertido = valorReal * cotacaoDaLibra;
			JOptionPane.showMessageDialog(null,
					"Você tem :" + new DecimalFormat().format(valorConvertido) + " R$ em Reais!");
		}
		
		 if(converteOpcao==null){
			  JOptionPane.showMessageDialog(null,"Digite um número");
			  calcula(converteOpcao);
		  
		  }
		/*
		 * try {
		 * 
		 * }catch(NumberFormatException e){ JOptionPane.showMessageDialog(null,
		 * "Digite um número!"); }
		 */

		if (opcao < 1 || opcao > 6) {
			JOptionPane.showMessageDialog(null, "Opção Inválida!, por favor escolher números entre 1 e 6.");

			int novaConversao;
			novaConversao = JOptionPane.showConfirmDialog(null,
					"Deseja fazer mais alguma conversão?" + JOptionPane.YES_NO_CANCEL_OPTION); // Deseja fazer mais
																								// alguma conversão?
			// boolean testeConversao;
			// testeConversao = JOptionPane.showInputDialog(novaConversao);

			if (novaConversao == 0) {

				testaOpcaoInvalida();
			} else if (novaConversao == 01 || novaConversao == 02) {
				JOptionPane.showMessageDialog(null, "Fim do Programa!");
			}
		}
		if (opcao >= 1 && opcao <= 6) {
			int outraConversao;
			outraConversao = JOptionPane.showConfirmDialog(null,
					"Deseja fazer mais alguma conversão?" + JOptionPane.YES_NO_CANCEL_OPTION); // Deseja fazer mais
																								// alguma conversão?
			if (outraConversao == 0) {
				testaOpcaoInvalida();
			} else if (outraConversao == 01 || outraConversao == 02) {
				JOptionPane.showMessageDialog(null, "Fim do Programa!");
			}
		}

	}

	public void testaOpcaoInvalida() {
		calcula(moeda);

	}
	

	public String getMoeda() {
		return this.moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public String getReal() {
		return this.real;
	}

	public void setReal(String real) {
		this.real = real;
	}

}
