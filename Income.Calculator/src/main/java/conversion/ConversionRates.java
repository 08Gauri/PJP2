package conversion;
import java.util.HashMap;

public class ConversionRates {

	static HashMap<String , Float> conversionRate = new HashMap<String, Float>();
	static 
	{
		conversionRate.put("USD" , (float) 1.0);
		conversionRate.put("INR" , (float) 66.0);
		conversionRate.put("GBP" , (float) 0.67);
		conversionRate.put("SGD" , (float) 1.5);
		conversionRate.put("HKD" , (float) 8.0);
	}
	public float getCurrentFactor(String currency) {
		return conversionRate.get(currency);
	}

}
