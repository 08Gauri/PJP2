package perCapita;

import java.util.HashMap;
import java.util.List;

import salary.SalaryAttributes;

public class Calculator {

	public static void calculate(String key, float amount, 
			List<SalaryAttributes> salaryList, HashMap<String, Float> totalSalaryPerKey, 
			HashMap<String, Integer> totalPeoplePerKey) 
	{
		
		if(totalPeoplePerKey.containsKey(key) == false)
			totalPeoplePerKey.put(key, 1);
		else
			totalPeoplePerKey.put(key , totalPeoplePerKey.getOrDefault(key, 0) + 1);
		
		if(totalSalaryPerKey.containsKey(key) == false)
			totalSalaryPerKey.put(key, amount);
		else
			totalSalaryPerKey.put(key , totalSalaryPerKey.getOrDefault(key, (float) 0.0) + amount);
			
		
	}

}
