package salary;

import basic.Currency;
import conversion.Conversion;

public class SalaryAttributes {

	private String city;
	private String country;
	private String gender;
	private String currency;
	private float amount;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		if (country == null || country.length() == 0)
			this.country = this.city;
		else
			this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		if (!this.currency.equals(Currency.USD))
			this.amount = Conversion.convert(this.currency, amount);
		else
			this.amount = amount;
	}

	@Override
	public String toString() {
		return "SalaryAttributes [city=" + city + ", country=" + country + ", gender=" + gender + ", currency="
				+ currency + ", amount=" + amount + "]";
	}

	public SalaryAttributes(String city, String country, String gender, String currency, String amount) {
		// TODO Auto-generated constructor stub
		setCity(city);
		setCountry(country);
		setGender(gender);
		setCurrency(currency);
		setAmount(Float.parseFloat(amount));
	}

}
