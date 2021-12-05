import javax.swing.JOptionPane;

public class AccountingAppARRAY {

	public static void main(String[] args) {
		
		double valueOFsupply = Double.parseDouble(args[0]); //Double.parseDouble()
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOFsupply * vatRate;
		double TOTAL = valueOFsupply + VAT;
		double EXPENSE = valueOFsupply * expenseRate;
		double INCOME = valueOFsupply - EXPENSE;
		
		double[] dividendRATEs = new double[3];
		dividendRATEs[0] = Double.parseDouble(JOptionPane.showInputDialog("Enter DIVIDENDrates1"));
		dividendRATEs[1] = Double.parseDouble(JOptionPane.showInputDialog("Enter DIVIDENDrates2"));
		dividendRATEs[2] = Double.parseDouble(JOptionPane.showInputDialog("Enter DIVIDENDrates3"));
		
		
		double DIVIDEND1 = INCOME * dividendRATEs[0];
		double DIVIDEND2 = INCOME * dividendRATEs[1];
		double DIVIDEND3 = INCOME * dividendRATEs[2];
		
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