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


//자바 배열 선언 및 초기화
//
//크기 할당&초기화 없이 배열 참조변수만 선언 
//int[] arr;    int arr[];
//
//선언과 동시에 배열 크기 할당
//int[] arr = new int[5];  String[] arr = new String[5];
//
//기존 배열의 참조 변수에 초기화 할당하
//int[] arr;
//arr = new int[5];
//
//선언과 동시에 배열의 크기 지정 및 값 초기화
//int[] arr = {1,2,3,4,5};   int[] arr = new int[] {1,2,3,4,5};   String[] weeks = {"월","화","수"};
//
//2차원 배열 선언
//int[][] arr = new int[4][3];    3의 크기의 배열을 4개 가질 수 있는 2차원 배열 할
//int[][] brr = { {2,5,3}, {1,2,3}, {4,3,4}, {9,4,5} }

