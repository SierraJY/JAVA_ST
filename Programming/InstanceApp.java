import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		//result1.txt 파일에 쓰기가 가능한 printwriter클래스를 실제로 생성해서 이름을 p1으로 붙임.
		//ex)-누군가의 비자카드를 만드는 공정(클래스)가 있다고 하면, john의 비자카드를 만드는 공정을 만들고 그것을 인스턴스라고 한다.
		//그리고 그 공정의 여러기능(메서드)를 이용해 카드에 이미지 문자등을 넣을 수 있다.
		//컨스트럭터라는 생성자가 prinwriter클래스에는 있지만 math에는 없다.생성자가 있다는 것은 생성자를 이용해서 인스턴스를 만드는 것이 허용되어있다는 뜻.
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
	}

}
