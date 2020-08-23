package Operations;

import java.time.LocalDate;

public class RelativeDays {

	public LocalDate getNDaysEarlier(int n, LocalDate date) {
		return date.minusDays(n);
	}

	public LocalDate getNWeekaEarlier(int n, LocalDate date) {
		return date.minusWeeks(n);
	}

	public LocalDate getNMonthsEarlier(int n, LocalDate date) {
		return date.minusMonths(n);
	}

	public LocalDate getNDaysFromNow(int n, LocalDate date) {
		return date.plusDays(n);
	}

	public LocalDate getNWeekFromNow(int n, LocalDate date) {
		return date.plusWeeks(n);
	}

	public LocalDate getNMonthsFromNow(int n, LocalDate date) {
		return date.plusMonths(n);
	}

	public LocalDate yesterday(LocalDate date) {
		return date.minusMonths(1);
	}

	public LocalDate tomorrow(LocalDate date) {
		return date.plusMonths(1);
	}

	public LocalDate dayBeforeYesterday(LocalDate date) {
		return date.minusMonths(2);
	}

	public LocalDate dayAfterTomorrow(LocalDate date) {
		return date.minusMonths(1);
	}

	public LocalDate lastWeek(LocalDate date) {
		return date.minusWeeks(1);
	}

	public LocalDate lastMonth(LocalDate date) {
		return date.minusMonths(1);
	}

	public LocalDate lastYear(LocalDate date) {
		return date.minusYears(1);
	}

}
