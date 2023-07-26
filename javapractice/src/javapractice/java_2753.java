package javapractice;
import java.util.Scanner;
public class java_2753 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요");
		int a = in.nextInt();
		
		if(a%4==0) {
			if(a%400==0) System.out.println("1");
			else if(a%100==0) System.out.println("0");
			else System.out.println("1");
		}
		else System.out.println("0");
	}
}