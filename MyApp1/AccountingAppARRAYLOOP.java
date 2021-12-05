public class AccountingAppARRAYLOOP {

	public static void main(String[] args) {
		
		double valueOFsupply = Double.parseDouble(args[0]); //Double.parseDouble()
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOFsupply * vatRate;
		double TOTAL = valueOFsupply + VAT;
		double EXPENSE = valueOFsupply * expenseRate;
		double INCOME = valueOFsupply - EXPENSE;
		
		System.out.println("Value of supply : " + valueOFsupply);
		System.out.println("VAT : " + VAT);
		System.out.println("Total : " + TOTAL + "\n");
		
		
		System.out.println("Expense : " + EXPENSE);
		System.out.println("Income : " + INCOME + "\n");
		
		double[] dividendRATEs = new double[3];
		dividendRATEs[0] = 0.5;
		dividendRATEs[1] = 0.3;
		dividendRATEs[2] = 0.2;
		
		int i = 0;
		while(i < dividendRATEs.length) {
		System.out.println("Dividend : " + (INCOME * dividendRATEs[i]));
		i += 1;
		}
	}
}