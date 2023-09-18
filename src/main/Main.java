package main;

import javax.swing.JOptionPane;

import currencyConverter.Function;
import temperatureConverter.TempFunction;

public class Main {
	
    public static void main (String[] args) {

        Function currencies = new Function();
        TempFunction temperature = new TempFunction();
             
        while(true) {
        	
        	String opciones = (String) (JOptionPane.showInputDialog(null, "Seleccione una opción ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {
        			"Convertir Moneda", "Convertir de Temperatura", "Salir"}, "Seleccion"));
        	
        	if (opciones==null) {
        		 System.out.println("Muchas gracias por Utilizar este programa");
        		 System.exit(0);
        	}
        	
        	switch(opciones) {
        	case "Convertir Moneda":
        		 String input = JOptionPane.showInputDialog("Ingrese el monto a convertir: ");
             	 if (input==null) {
	           		break;
	             }
                 if(Validator.validateNumber(input) == true) {
                     double Minput = Double.parseDouble(input);
                     currencies.currenciesConverter(Minput);

                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra operacion?");
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                        	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                     }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor no válido");                
                    }
             break;
        	
        	 case "Convertir de Temperatura":
        	 input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
         	 if (input==null) {
           		break;
             }
             if(Validator.validateNumber(input) == true) {
                 double Minput = Double.parseDouble(input);
                 temperature.ConvertirTemperatura(Minput);

                 int respuesta = 0;
                 respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                 if((respuesta == 0) && (Validator.validateNumber(input) == true)) { 
                 } else {
                     JOptionPane.showMessageDialog(null, "Programa terminado");                     
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Valor inválido");                
             }
             break;
             
        	 case "Salir":
        		 System.out.println("Muchas gracias por Utilizar este programa");
        		 System.exit(0);
        }                
    }
               
  }

}
        	
