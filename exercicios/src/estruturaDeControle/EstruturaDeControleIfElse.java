package estruturaDeControle;

import javax.swing.JOptionPane;

public class EstruturaDeControleIfElse {
	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe um n�mero");
          
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � Par");
		}else {
			System.out.println("O n�mero " + numero + " � Impar");
		}
	}
}
