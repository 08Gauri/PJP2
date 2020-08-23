package perCapita;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import salary.SalaryAttributes;

public class PerCapitaCalculator {

	static HashMap<String , Float> totalSalaryPerKey = new HashMap<String, Float>();
	static HashMap<String, Integer> totalPeoplePerKey = new HashMap<String, Integer>();
	static List<PerCapitaAttribute> perCapitaSalaryList = new ArrayList<PerCapitaAttribute>();
	
	public List<PerCapitaAttribute> calculate(List<SalaryAttributes> salaryList) {
		
		
		for(SalaryAttributes salary : salaryList)
		{
			String key = salary.getCountry() + "_" + salary.getGender();
			float amount = salary.getAmount();
			Calculator.calculate(key , amount , salaryList ,
								 totalSalaryPerKey , totalPeoplePerKey);
		}
		
		for(String key : totalSalaryPerKey.keySet())
		{
			String country = key.split("_")[0];
			String gender = key.split("_")[1];
			
			float perCapitaIncome = totalSalaryPerKey.get(key) / (float) totalPeoplePerKey.get(key);
			
			perCapitaSalaryList.add(new PerCapitaAttribute(country, gender, perCapitaIncome));
			
		}
		
		
		return perCapitaSalaryList;
	}

}
