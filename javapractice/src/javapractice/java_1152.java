package javapractice;
import java.util.Scanner;
import java.util.StringTokenizer;

public class java_1152 {
	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		
		String s = str.nextLine();
		str.close();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens());
	}
}

/*
StringTokenizer 을 사용하여 분리 기준을 공백으로 지정해주면 공백을 기준으로 나뉘어 토큰에 저장해주는 것이다.

단 StringTokenizer 을 사용하기 위해서는 java.util.StringTokenizer; 을 import 해주어야 한다.  
 
 */