package Operations;

import java.time.LocalDate;

public class AddToDate {

	public LocalDate addDaysToDate(LocalDate date , int days)
	{
		return date.plusDays(days);
	}
	
	public LocalDate addMonthsToDate(LocalDate date , int months)
	{
		return date.plusMonths(months);
	}
	
	public LocalDate addWeeksToDate(LocalDate date , int weeks)
	{
		return date.plusMonths(weeks);
	}
	
	public LocalDate addYearsToDate(LocalDate date , int years)
	{
		return date.plusMonths(years);
	}
}
