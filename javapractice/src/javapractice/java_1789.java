package javapractice;
import java.util.Scanner;

public class java_1789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextInt();
		long sum = 0;
		int count = 0;
	
		
		for (int i= 1; ; i++ ) {
			if(sum> N)break;
			
			sum += i;
			count++;
			
		}
		
		System.out.println(count - 1);
		sc.close();
		
	}
}