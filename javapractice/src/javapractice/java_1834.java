package javapractice;
import java.util.Scanner;


public class java_1834 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
        long num = sc.nextLong();
        long sum  = 0;
        for(long i=1;i<num;i++)
        {
            sum += (num+1)*i;
        }
 
        System.out.println(sum);
 
    }
}

