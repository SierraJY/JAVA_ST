
public class AccountingAppIF {

	public static void main(String[] args) {
		
		double valueOFsupply = Double.parseDouble(args[0]); //Double.parseDouble()
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOFsupply * vatRate;
		double TOTAL = valueOFsupply + VAT;
		double EXPENSE = valueOFsupply * expenseRate;
		double INCOME = valueOFsupply - EXPENSE;
		double DIVIDEND1;
		double DIVIDEND2;
		double DIVIDEND3;
		
		if(INCOME > 10000.0) {
			DIVIDEND1 = INCOME * 0.5;
			DIVIDEND2 = INCOME * 0.3;
			DIVIDEND3 = INCOME * 0.2;
			
		} else {
			DIVIDEND1 = INCOME * 1.0;
			DIVIDEND2 = INCOME * 0;
			DIVIDEND3 = INCOME * 0;
		}
		
		System.out.println("Value of supply : " + valueOFsupply);
		System.out.println("VAT : " + VAT);
		System.out.println("Total : " + TOTAL + "\n");
		
		
		System.out.println("Expense : " + EXPENSE);
		System.out.println("Income : " + INCOME + "\n");
		
		System.out.println("Dividend 1 : " + DIVIDEND1);
		System.out.println("Dividend 2 : " + DIVIDEND2);
		System.out.println("Dividend 3 : " + DIVIDEND3);
	}
}