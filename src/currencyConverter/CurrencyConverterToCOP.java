package currencyConverter;

import javax.swing.JOptionPane;

public class CurrencyConverterToCOP {
	public void convertUSDtoCOP(double currency) {
		double USD = currency * 3930.00;
		USD = (double) Math.round(USD *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +USD+ " Pesos Colombianos");
	}
	
	public void converterEurToCOP(double currency) {
		double EUR = currency * 4050.48;
		EUR = (double) Math.round(EUR *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +EUR+ " Pesos Colombianos");
	}
	
	public void convertPoundToCOP(double currency) {
		double pound = currency * 4890.52;
        pound = (double) Math.round(pound *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +pound+ " Pesos Colombianos");
	}
	
	public void convertCNYToCOP(double currency) {
		double CNY = currency * 540.18;
		CNY = (double) Math.round(CNY *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +CNY+ " Pesos Colombianos");
	}
	
	public void convertYenToCOP(double currency) {
		double Yen = currency * 29.68;
        Yen = (double) Math.round(Yen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Yen+ " Pesos Colombianos");
	}
	
	public void convertWonToCOP(double currency) {
		double Won = currency * 3.04;
        Won = (double) Math.round(Won *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Won+ " Pesos Colombianos");
	}
}
