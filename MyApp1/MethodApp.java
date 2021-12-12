
public class MethodApp {

	public static double valueOFsupply;
	//지역변수는 메소드 내에서 선언되며 메소드 내에서만 사용할 수 있다. 클래스변수 인스턴스변수 지역변수는 다른 것.
	public static void main(String[] args) {
		//메소드는 서로연관된 코드를 그룹핑해서 이름을 붙인 정리정돈 상자다.
		
		valueOFsupply = 10000.0;
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = getVAT(vatRate);
		double TOTAL = getTotal(vatRate);
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
	public static double getVAT(double vatRate) {
		return valueOFsupply * vatRate;
	}
	
	//public static double getVAT() {
	//	return valueOFsupply * vatRate;
	//}  메인함수 밖에서 public static double valueOfSupply = 10000.0으로 선언하면 이렇게 메소드를 선언해도 됨.
	//  지역변수를 전역변수로 바꾸면 메소드의 파라미터를 없앨 수 있음. 
	//    이클립스에서 변수 블록하고 우클릭 -> 리팩터 -> convert local variable to filed.

	public static double getTotal(double vatRate) {
		return valueOFsupply + getVAT(vatRate);
	}
}