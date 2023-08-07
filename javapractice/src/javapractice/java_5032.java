package javapractice;
import java.util.Scanner;

public class java_5032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt(); 	// 빈 병 수 
		int f = sc.nextInt();	// 발견한 빈 병의수 
		int c = sc.nextInt();	// 	새 병 필요한 빈 병 수 
		
		int sum = e + f; // 총 가지고 있는 빈병 수
		int ans = 0;	 // 마실 수 있는 탄산 음료 개수
		while(sum >= c) {
			int mok = sum / c;	// 현재 마실 수 있는 음료수
			ans += mok;			// 현재 마실 수 있는 음료수
			sum = mok + (sum%c); // 이전에 교환해서 마신 음료수 + 빈병
		}
		
		System.out.println(ans);
	}

}