package estruturaDeControle;

import javax.swing.JOptionPane;

public class EstruturaDeControleIfElse {
	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe um número");
          
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é Par");
		}else {
			System.out.println("O número " + numero + " é Impar");
		}
	}
}
