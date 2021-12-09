class Accounting{
	public static double valueOFsupply;
	
	public static double getVAT(double vatRate) {
		return valueOFsupply * vatRate;
	}

	public static double getTotal(double vatRate) {
		return valueOFsupply + getVAT(vatRate);
	}
	
}
public class AccountingClassApp {

	
	public static void main(String[] args) {
		
		Accounting.valueOFsupply = 10000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = Accounting.getVAT(vatRate);
		double TOTAL = Accounting.getTotal(vatRate);
		double EXPENSE = Accounting.valueOFsupply * expenseRate;
		double INCOME = Accounting.valueOFsupply - EXPENSE;
		double DIVIDEND1 = INCOME * 0.5;
		double DIVIDEND2 = INCOME * 0.3;
		double DIVIDEND3 = INCOME * 0.2;
		//anothervariable = ...;
		//anotherMethod = ...;
		
		System.out.println("Value of supply : " + Accounting.valueOFsupply);
		System.out.println("VAT : " + VAT);
		System.out.println("Total : " + TOTAL + "\n");
		
		
		System.out.println("Expense : " + EXPENSE);
		System.out.println("Income : " + INCOME + "\n");
		
		System.out.println("Dividend 1 : " + DIVIDEND1);
		System.out.println("Dividend 2 : " + DIVIDEND2);
		System.out.println("Dividend 3 : " + DIVIDEND3);
	}
}