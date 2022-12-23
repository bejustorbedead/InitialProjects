package converter;

public class CurrencyConverter {
	
	public double dolar, quant;

	public double conversor() {
		return (6 * (quant * dolar) / 100) + quant * dolar; 
	}
	
}
