package currencyConverter;

import javax.swing.JOptionPane;

public class Function {

	CurrencyConverter currencies = new CurrencyConverter();
	CurrencyConverterToCOP COP = new CurrencyConverterToCOP();
	
    public void currenciesConverter(double currencyInput) {
    	String opcion = (String) (JOptionPane.showInputDialog(null, 
    			"Ingrese la moneda de Cambio", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De COP a Dólar", "De COP a Euro", "De COP a Libras","De COP a Yuan","De COP a Yen","De COP a Won Coreano","De Dólar a COP", 
    					"De Euro a COP", "De Libras a COP","De Yuan a COP","De Yen a COP","De Won Coreano a COP"}, 
    			"Seleccion"));
    	if (opcion==null) {
   		 System.out.println("Muchas gracias por Utilizar este programa");
   		 System.exit(0);
    	}
        switch(opcion) {
        case "De COP a Dólar":
        	currencies.convertCOPtoUSD(currencyInput);
        	break;
        case "De COP a Euro":
        	currencies.converCOPtoEur(currencyInput);
        	break;
        case "De COP a Libras":
        	currencies.convertCOPtoPound(currencyInput);
        	break;
        case "De COP a Yuan":
        	currencies.convertCOPtoCNY(currencyInput);
        	break;
        case "De COP a Yen":
        	currencies.convertCOPtoYen(currencyInput);
        	break;
        case "De COP a Won Coreano":
        	currencies.convertCOPtoWon(currencyInput);
        	break;    	    	                          
        case "De Dólar a COP":
        	COP.convertUSDtoCOP(currencyInput);
        	break;
        case "De Euro a COP":
        	COP.converterEurToCOP(currencyInput);
        	break;
        case "De Libras a COP":
        	COP.convertPoundToCOP(currencyInput);
        	break;
        case "De Yuan a COP":
        	COP.convertCNYToCOP(currencyInput);
        	break;
        case "De Yen a COP":
        	COP.convertYenToCOP(currencyInput);
        	break;
        case "De Won Coreano a COP":
            COP.convertWonToCOP(currencyInput);
            break;
        }      
    }
        
}
