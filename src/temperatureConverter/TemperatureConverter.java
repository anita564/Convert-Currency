package temperatureConverter;

import javax.swing.JOptionPane;

public class TemperatureConverter {
	
	public double convertCelciusToFarenheit(double value) {
		double farenheit = value * 1.8 + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " °C son " +farenheit+ " °F ");
		return farenheit;
	}
	
	public void convertCelciusToKelvin(double value){
		double kelvin = value + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " °C son " +kelvin+ " Kelvin");
	}
	
	public void convertFarenheitToCelcius(double value) {
		double celcius = (value - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " °F son " +celcius+ " °C");
	}
	
	public void convertFarenheitToKelvin(double value) {
		double celcius = (value - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        double kelvin = celcius + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " °F son " +kelvin+ " Kelvin");
	}
	
	public double convertKelvinToCelcius(double value) {
		 double kelvinCelcius = value - 273.15;
         kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
         JOptionPane.showMessageDialog(null, +value+ " Kelvin son " +kelvinCelcius+ " °C");
         return kelvinCelcius;
	}
	
	public void convertKelvinToFarenheit(double value) {
		double kelvinFarenheit = convertKelvinToCelcius(value);
		kelvinFarenheit = convertCelciusToFarenheit(kelvinFarenheit);
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " Kelvin son " +kelvinFarenheit+ " °F");
	}

}
