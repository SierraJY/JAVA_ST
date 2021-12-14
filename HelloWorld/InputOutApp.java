import java.util.Scanner;

public class InputOutApp{
    public static void main(String args[]){
        int a;
        int b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("a의 값을 입력하시오 = ");
        a = sc.nextInt();
        System.out.println("b의 값을 입력하시오 = ");
        b = sc.nextInt();
        
        System.out.println(a+b);
        
    }
}