package javapractice;
import java.util.Scanner;

public class java_1547 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cup[] =new int [3];		//3개의 컵 배열
		
		cup[0] = 1;		//1번 컵 아래에 공을 하나 넣는다
		cup[1] = 0;		//공이 있는 컵의 위치를 1이라고 표시한다.
		cup[2] = 0;
		
		int times = sc.nextInt();
		
		for (int i = 0; i< times; i++) {	//
			int move1 = Integer.parseInt(sc.next())-1;	//x번째 컵의 위치
			int move2 = sc.nextInt() -1;
			
			int tmp = 0;
			
			tmp = cup[move1];
			cup[move1]= cup[move2];
			cup[move2]= tmp;;			
		}	
		
		for(int i= 0; i<3; i++) {
		if(cup[i]==1)
		System.out.println(i+1);
		
		}		
	}
}