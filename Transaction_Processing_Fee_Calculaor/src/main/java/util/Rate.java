package util;

import transaction.TransactionRate;
import transaction.Type;

public class Rate {


	public static float getRate(Type type, boolean isPriority) {
		// TODO Auto-generated method stub
		String key = "";
		if(isPriority == true)
			key = "high";
		else
			key = type.toString();
		if(TransactionRate.rates.containsKey(key))
			return TransactionRate.rates.get(key);
		
		return (float) 0.0;
	}

}
