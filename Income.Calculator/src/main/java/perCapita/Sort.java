package perCapita;

import java.util.Collections;
import java.util.List;

public class Sort {

	public static List<PerCapitaAttribute> sort(List<PerCapitaAttribute> perCapitaSalaryList) {
		Collections.sort(perCapitaSalaryList , 
        		(a,b) ->a.getCountry() != b.getCountry() ? a.getCountry().compareTo(b.getCountry()) : 
        		 a.getGender().compareTo(b.getGender()));
		
		return perCapitaSalaryList;
		
	}

}
