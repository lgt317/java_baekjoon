package javapractice;
import java.util.Scanner;

		
public class java_4470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		for (int i= 0; i < N; i++) {
	
				System.out.println((i + 1)+"." +sc.nextLine());
		
		}
		sc.close();
	}

}