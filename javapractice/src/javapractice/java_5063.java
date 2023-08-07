package javapractice;
import java.util.Scanner;
public class java_5063 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum;
		
		for(int i = 0; i <n; i++) {
			
			int r = sc.nextInt();
			int e = sc.nextInt();
			int c = sc.nextInt();
				
			sum = e - c;
			if (sum >r) {
				System.out.println("advertise");
			}
			if (sum == r ) {
				System.out.println("does not matter");
			}
			
			if (sum < r ){
				System.out.println("do not advertise");
				
			}
			
		}
		sc.close();
		
	}

}
