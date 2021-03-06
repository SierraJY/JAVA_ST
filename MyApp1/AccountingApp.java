
public class AccountingApp {

	public static void main(String[] args) {
		//이렇게 프로그램의 기능은 바꾸지 않으면서 이해하기 쉽게 바꾸는 과정을 리팩토링이라고 합니다.
		
		double valueOFsupply = Double.parseDouble(args[0]); //Double.parseDouble()
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOFsupply * vatRate;
		double TOTAL = valueOFsupply + VAT;
		double EXPENSE = valueOFsupply * expenseRate;
		double INCOME = valueOFsupply - EXPENSE;
		double DIVIDEND1 = INCOME * 0.5;
		double DIVIDEND2 = INCOME * 0.3;
		double DIVIDEND3 = INCOME * 0.2;
		
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