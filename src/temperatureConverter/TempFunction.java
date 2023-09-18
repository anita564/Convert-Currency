package temperatureConverter;

import javax.swing.JOptionPane;

public class TempFunction {
	
	TemperatureConverter temperature = new TemperatureConverter();
	
	public void ConvertirTemperatura(double tempInput) {
    	String opcion = (String) (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
    			"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Grados Farenheit a Kelvin",
    			"Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion"));
    	if (opcion==null) {
   		 System.out.println("Muchas gracias por Utilizar este programa");
   		 System.exit(0);
    	}
        switch(opcion) {
        case "Grados Celcius a Grados Farenheit":
        	temperature.convertCelciusToFarenheit(tempInput);
        	break;
        case "Grados Celcius a Kelvin":
            temperature.convertCelciusToKelvin(tempInput);
            break;
        case "Grados Farenheit a Grados Celcius":
           temperature.convertFarenheitToCelcius(tempInput);
           break;
        case "Grados Farenheit a Kelvin":
        	temperature.convertFarenheitToKelvin(tempInput);
           break;
        case "Kelvin a Grados Celcius":
           temperature.convertKelvinToCelcius(tempInput);
           break;
        case "Kelvin a Grados Farenheit":
        	temperature.convertKelvinToFarenheit(tempInput);
        	break;
        }
	}
}
    	
     


