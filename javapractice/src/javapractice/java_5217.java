package javapractice;
import java.util.Scanner;

public class java_5217 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String s = "Paris for";
            int input = in.nextInt();
            int a = 1, b = 1;
            System.out.print(s + input + ':');
            for (int j = 1; j < input; j++) {
                for (int k = j + 1; k < input; k++) {
                    if (j + k == input) {
                        System.out.print(" " + j + " " + k);
                    }
                }
            }
            System.out.println();
        }
    }
}

