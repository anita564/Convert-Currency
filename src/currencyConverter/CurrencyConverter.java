package currencyConverter;

import javax.swing.JOptionPane;

public class CurrencyConverter {
	
	public void convertCOPtoUSD(double COP) {
		double USD = COP / 3739.00;
		USD = (double) Math.round(USD *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +USD+ " Dolares");
	}
	
	public void converCOPtoEur(double COP) {
		double Eur = COP / 4193.55;
		Eur = (double) Math.round(Eur *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +Eur+ " Euros");
	}
	
	public void convertCOPtoPound(double COP) {
		double Pound = COP / 4871.84;
        Pound = (double) Math.round(Pound *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Pound+ " Libras Esterlinas");
	}
	
	public void convertCOPtoCNY(double COP) {
		double CNY = COP / 540.18;
		CNY = (double) Math.round(CNY *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +CNY+ " Yuanes");
	}
	
	public void convertCOPtoYen(double COP) {
		double Yen = COP / 26.59;
        Yen = (double) Math.round(Yen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Yen+ " Yuanes");
	}
	
	public void convertCOPtoWon(double COP) {
		double Won = COP / 2.96;
        Won = (double) Math.round(Won *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +Won+ " Wons");
	}
	
}
