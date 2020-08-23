package util;

import java.util.Collections;
import java.util.List;

import report.ReportAttribute;

public class Sort {

	public static List<ReportAttribute> sort(List<ReportAttribute> reportList) {
		// sort according to Client Id, Transaction Type, Transaction Date and
		// Priority.
		Collections.sort(reportList,
				(a, b) -> a.getClientId() != b.getClientId() ? MyCompare.compare(a.getClientId(), b.getClientId())
						: a.getTransactionType() != b.getTransactionType()
								? MyCompare.compare(a.getTransactionType(), b.getTransactionType())
								: a.getTransactionDate().equals(b.getTransactionDate()) == false
										? MyCompare.compare(a.getTransactionDate(), b.getTransactionDate())
										: MyCompare.compare(a.isPriority(), b.isPriority()));

		return reportList;
	}

}
