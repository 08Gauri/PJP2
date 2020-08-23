package Calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import report.ReportAttribute;
import transaction.TransactionAttribute;
import transaction.Type;
import util.Date;
import util.Rate;

public class FeeCalculator {
	HashMap<String, TransactionAttribute> transactionMap = new HashMap<String, TransactionAttribute>();
	List<ReportAttribute> reportList = new ArrayList<ReportAttribute>();

	public List<ReportAttribute> calculate(List<TransactionAttribute> transactionList) {

		for (TransactionAttribute transaction : transactionList) {
			String key = transaction.getClientId() + "_" + transaction.getSecurityId() + "_"
					+ transaction.getTransactionDate().toString();
			System.out.println(key);

			if (transactionMap.containsKey(key)) {
				TransactionAttribute previousTransaction = transactionMap.get(key);
				if (transaction.getType().equals(Type.SELL) && previousTransaction.getType().equals(Type.BUY)) {
					previousTransaction.setType(Type.INTRADAY);

				}

			} else {
				transactionMap.put(key, transaction);
			}
		}
		for (String key : transactionMap.keySet()) {

			TransactionAttribute transaction = transactionMap.get(key);
			System.out.println(transaction.getClientId());
			long clientId = transaction.getClientId();
			Type type = transaction.getType();
			Date transactionDate = transaction.getTransactionDate();
			boolean isPriority = transaction.isPriority();
			float processingFee = Rate.getRate(type, isPriority);
			ReportAttribute reportItem = new ReportAttribute(clientId, type, transactionDate, isPriority,
					processingFee);

			reportList.add(reportItem);
			
		}
		return reportList;
	}

}
