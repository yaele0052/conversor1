import java.util.Scanner;

import javax.swing.JOptionPane;

public class Testeandociclo {
	public static void main(String[] args) {
		
		Object[] Monedas = { "Peso a Dolar","Peso a Euro","Peso a Libra Esterlina","Peso a Yen","Peso a Won Sul"};

		 Object MonedaEscogida = JOptionPane.showInputDialog(null,
		             "Seleccione el tipo de cambio", "Divisas",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             Monedas, Monedas[0]);
		 System.out.println(MonedaEscogida);
	}
}
