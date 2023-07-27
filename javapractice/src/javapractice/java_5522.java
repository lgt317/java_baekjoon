package javapractice;
	import java.util.Scanner;
	
	public class java_5522 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
	
			int score[] = new int[10];
			int sum =0;
			
			
			for(int i =0; i<10 ; i++) {
				score[i]= sc.nextInt();	
				sum += score[i];	
			}
		
	 		System.out.println(sum);
			
		}
	
	}
