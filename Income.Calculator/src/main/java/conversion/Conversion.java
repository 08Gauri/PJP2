package conversion;

public class Conversion {

	public static float convert(String currency, float amount) {
		
		ConversionRates conversionRates = new ConversionRates();
		float conversionFactor = conversionRates.getCurrentFactor(currency);	
		return (float) amount / conversionFactor;
	}

}
