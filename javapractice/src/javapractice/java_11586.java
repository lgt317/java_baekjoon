package javapractice;
import java.util.Scanner;

public class java_11586 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 char arr[][] = new char [n][n];
		 for(int i=0; i<n; i++)
	            arr[i] = sc.next().toCharArray();
	        
		 
		 
		 int k = sc.nextInt();
	        
	        switch(k) {
	            case 1 :
	                for(int i=0; i<n; i++) {
	                    for(int j=0; j<n; j++)
	                        System.out.print(arr[i][j]);
	                    System.out.println();
	                }
	                break;
	            case 2 :
	                for(int i=0; i<n; i++) {
	                    for(int j=n-1; j>=0; j--)
	                        System.out.print(arr[i][j]);
	                    System.out.println();
	                }
	                break;
	            case 3 :
	                for(int i=n-1; i>=0; i--) {
	                    for(int j=0; j<n; j++)
	                        System.out.print(arr[i][j]);
	                    System.out.println();
	                }
	        }
	        
	}

}
