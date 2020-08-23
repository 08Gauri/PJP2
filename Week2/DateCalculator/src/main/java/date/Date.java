package date;

import java.time.LocalDate;

public class Date {

	private int day;
	private int month;
	private int year;
	private LocalDate date;

	public Date(String userInput) {
		LocalDate date = LocalDate.parse(userInput);
		String day = userInput.split("-")[0];
		String month = userInput.split("-")[1];
		String year = userInput.split("-")[2];

		this.setDay(Integer.parseInt(day));
		this.setMonth(Integer.parseInt(month));
		this.setYear(Integer.parseInt(year));

	}

	public Date() {
		this.setDay(1);
		this.setMonth(1);
		this.setYear(1900);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getDay() + "-" + this.getMonth() + "-" + this.getYear();
	}

}
