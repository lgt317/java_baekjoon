package javapractice;

import java.util.*;

public class java_4892 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = 1;
		//무한루프
		while(true) {
			int n = in.nextInt();
		

			//무한루프 종료
			if(n == 0) break;
			
			//n의 짝수 여부 조건문
			if(n % 2 == 0) {
				n = (((n * 3) / 2) * 3) / 9;
				System.out.println(count + ". even " + n);
			}else {
				n = ((((n * 3) + 1) / 2) * 3) / 9;
				System.out.println(count + ". odd " + n);
			}
			++count;
		}
	}

}