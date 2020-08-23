package perCapita;

public class PerCapitaAttribute {

	private String country;
	private String gender;
	private float perCapitaIncome;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getPerCapitaIncome() {
		return perCapitaIncome;
	}

	public void setPerCapitaIncome(float perCapitaIncome) {
		this.perCapitaIncome = perCapitaIncome;
	}

	public PerCapitaAttribute(String country, String gender, float perCapitaIncome) {
		super();
		this.country = country;
		this.gender = gender;
		this.perCapitaIncome = perCapitaIncome;
	}

	@Override
	public String toString() {
		return "PerCapitaAttribute [country=" + country + ", gender=" + gender + ", perCapitaIncome=" + perCapitaIncome
				+ "]";
	}

}
