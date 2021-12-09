class accountingins{
	public double valueOFsupply;
	
	public double getVAT(double vatRate) {
		return valueOFsupply * vatRate;
	}

	public double getTotal(double vatRate) {
		return valueOFsupply + getVAT(vatRate);
	}
	
}
public class AccountingInstanceApp {

	
	public static void main(String[] args) {
		
		//인스턴스는 하나의 클래스를 복제해서 서로 다른 데이터의 값과 서로 같은 메소드를 가진 복제본을 만드는 것.
		//인스턴스 생성 
		
		accountingins a1 = new accountingins();
		a1.valueOFsupply = 50000.0;
		
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = a1.getVAT(vatRate);
		double TOTAL = a1.getTotal(vatRate);
		double EXPENSE = a1.valueOFsupply * expenseRate;
		double INCOME = a1.valueOFsupply - EXPENSE;
		double DIVIDEND1 = INCOME * 0.5;
		double DIVIDEND2 = INCOME * 0.3;
		double DIVIDEND3 = INCOME * 0.2;

		
		System.out.println("Value of supply : " + a1.valueOFsupply);
		System.out.println("VAT : " + VAT);
		System.out.println("Total : " + TOTAL + "\n");
		
		
		System.out.println("Expense : " + EXPENSE);
		System.out.println("Income : " + INCOME + "\n");
		
		System.out.println("Dividend 1 : " + DIVIDEND1);
		System.out.println("Dividend 2 : " + DIVIDEND2);
		System.out.println("Dividend 3 : " + DIVIDEND3);
		
		//-----------------------------------------------------
		
		accountingins a2 = new accountingins();
		a2.valueOFsupply = 25000.0;
		
		double vatRate2 = 0.1;
		double expenseRate2 = 0.3;
		double VAT2 = a2.getVAT(vatRate2);
		double TOTAL2 = a2.getTotal(vatRate2);
		double EXPENSE2 = a2.valueOFsupply * expenseRate2;
		double INCOME2 = a2.valueOFsupply - EXPENSE2;
		double DIVIDEND1_2 = INCOME * 0.5;
		double DIVIDEND2_2 = INCOME * 0.3;
		double DIVIDEND3_2 = INCOME * 0.2;

		
		System.out.println("Value of supply : " + a2.valueOFsupply);
		System.out.println("VAT : " + VAT2);
		System.out.println("Total : " + TOTAL2 + "\n");
		
		
		System.out.println("Expense : " + EXPENSE2);
		System.out.println("Income : " + INCOME2 + "\n");
		
		System.out.println("Dividend 1 : " + DIVIDEND1_2);
		System.out.println("Dividend 2 : " + DIVIDEND2_2);
		System.out.println("Dividend 3 : " + DIVIDEND3_2);
		
		
	}
}