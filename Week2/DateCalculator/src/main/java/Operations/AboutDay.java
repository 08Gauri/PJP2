package Operations;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class AboutDay {

	public DayOfWeek getDay(LocalDate date)
	{
		return date.getDayOfWeek();
	}
	
	public int getWeek(LocalDate date)
	{
		WeekFields weekFields = WeekFields.of(Locale.getDefault()); 
		return date.get(weekFields.weekOfWeekBasedYear());
	}
	
}
