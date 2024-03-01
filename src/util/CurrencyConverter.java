package util;

public class CurrencyConverter {
	
	public static final double IOF = 6.00;
	
	public static double converter(double dolar, double ammount) {
		return (dolar*ammount) + (IOF/100 * dolar * ammount);
	}
}
