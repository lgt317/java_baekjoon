package javapractice;
import java.util.Scanner;


public class java_2947 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int arr[] = new int[5];
		
		for (int i = 0; i<5; i++) {
			arr[i] =sc.nextInt();
		}
		
		  for (int j=0;j<5;j++){
	            for (int i = 0; i < 4; i++) {
	                if(arr[i]>arr[i+1]){
	                    int tmp = arr[i];
	                    arr[i] = arr[i+1];
	                    arr[i+1] = tmp;
	                    for (int num : arr) {
	                        System.out.print(num+" ");
	                    }
	                    System.out.println();
	                }
	            }
	        }
	}

}
