import javax.swing.JOptionPane;

public class Conversor_De_Divisas {
	public static void main(String[] args) {
		
		int seguir = 1;

		while (seguir == 1) {
			String Valor1 = "Convertir Monedas";
			String Valor2 = "Convertir Temperaturas";
			Object[] possibleValues = { Valor1, Valor2 };

			Object selectedValue = JOptionPane.showInputDialog(null, "Elija el tipo de conversion que desea", "Menu",
					JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);

			try {
				if (selectedValue == "Convertir Monedas") {

					double inputValue = Double.parseDouble(JOptionPane.showInputDialog(null,
							"Ingrese la cantidad a convertir", "Conversor de Monedas", 3));

					Object[] Monedas = { "Peso a Dolar", "Peso a Euro", "Peso a Libra Esterlina", "Peso a Yen",
							"Peso a Won Sul" };

					Object MonedaEscogida = JOptionPane.showInputDialog(null, "Seleccione el tipo de cambio", "Divisas",
							JOptionPane.INFORMATION_MESSAGE, null, Monedas, Monedas[0]);

					if (MonedaEscogida == "Peso a Dolar") {
						double Conversion = inputValue / 17.14;
						JOptionPane.showMessageDialog(null, "Tienes " + Conversion + " Dolares", "Conversion", 1);
					} else if (MonedaEscogida == "Peso a Euro") {
						double Conversion = inputValue / 18.79;
						JOptionPane.showMessageDialog(null, "Tienes " + Conversion + " Euros", "Conversion", 1);
					} else if (MonedaEscogida == "Peso a Libra Esterlina") {
						double Conversion = inputValue / 21.99;
						JOptionPane.showMessageDialog(null, "Tienes " + Conversion + " Libras Esterlinas", "Conversion",
								1);
					} else if (MonedaEscogida == "Peso a Yen") {
						double Conversion = inputValue / 0.12;
						JOptionPane.showMessageDialog(null, "Tienes " + Conversion + " Yenes", "Conversion", 1);
					} else {
						double Conversion = inputValue / 0.013;
						JOptionPane.showMessageDialog(null, "Tienes " + Conversion + " Won Sul", "Conversor", 1);
					}

				} else {
					double inputValue = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Ingrese la Temperatura a convertir", "Conversor de Temperatura", 1));
					System.out.println(inputValue);
					Object[] Monedas = { "Centigrado a Ferenheit", "Centigrado a Kelvin" };

					Object MonedaEscogida = JOptionPane.showInputDialog(null, "Seleccione el tipo de cambio", "Divisas",
							JOptionPane.INFORMATION_MESSAGE, null, Monedas, Monedas[0]);
					if (MonedaEscogida == "Centigrado a Kelvin") {
						double Conversion = inputValue + 273.15;
						JOptionPane.showMessageDialog(null, "Tu temperatura equivale a  " + Conversion + " °K",
								"Conversion", 1);
					}

					else if (MonedaEscogida == "Centigrado a Ferenheit") {
						double Conversion = (inputValue * 1.8 + 32);
						JOptionPane.showMessageDialog(null, "Tu temperatura aquivale a " + Conversion + " °F",
								"Conversion", 1);
					}
				}

			}

			catch (NumberFormatException | NullPointerException Excepcion) {
				Excepcion.printStackTrace();
				JOptionPane.showMessageDialog(null, "No se permite texto, caracteres especiales y/o cancelar", "Error",
						0);
			}
			int choice = JOptionPane.showInternalConfirmDialog(null, "¿Desea continuar con el programa?",
					"Repetir programa", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (choice == JOptionPane.YES_OPTION) {
				seguir = 1;

			} else {
				seguir = 0;
				JOptionPane.showMessageDialog(null, "Programa Finalizado", "Finalizado", 1);
			}
		}

	}

}
