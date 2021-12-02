
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // == double b = (double) 1;
		System.out.println(b);

		//int c = 1.1; 틀림 
		//double d = 1.1;
		
		int e = (int) 1.1;
		System.out.println(e);
		
		//1 to string
		String f = Integer.toString(1);  //정수를 문자열로 캐스팅 toString매소드 S
		System.out.println(f);
		System.out.println(f.getClass()); // .getClass-- 변수가 가지고 있는 값의 타입을 알려줌	
		
	}

}
