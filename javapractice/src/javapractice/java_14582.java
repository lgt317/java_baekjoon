package javapractice;
import java.util.Scanner;


public class java_14582 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[9];
        for(int i=0; i<9; i++)
            a[i] = sc.nextInt();
        
        int b[] = new int[9];
        for(int i=0; i<9; i++)
            b[i] = sc.nextInt();
        
        int ulim = 0;
        int stl = 0;
        for(int i=0; i<9; i++) {
        	
            ulim += a[i];
            stl += b[i];
            if(ulim > stl) {
                System.out.println("Yes");
                return;
            }
            ulim += a[i];
        }
        
        System.out.println("No");
    }
}