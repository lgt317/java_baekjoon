package javapractice;
import java.util.Scanner;


public class java_4493 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < N; i++) { // round
			int G = Integer.parseInt(scan.nextLine());
			int score = 0;
			for (int j = 0; j < G; j++) { // game
				String[] str = scan.nextLine().split(" ");
				if (!str[0].equals(str[1])) {
					if (str[0].equals("R")) {
						if (str[1].equals("S"))
							++score;
						else if (str[1].equals("P"))
							--score;
					} else if (str[0].equals("P")) {
						if (str[1].equals("S"))
							--score;
						else if (str[1].equals("R"))
							++score;
					} else if (str[0].equals("S")) {
						if (str[1].equals("R"))
							--score;
						else if (str[1].equals("P"))
							++score;
					}
				}
			}

			String ret = "";
			if (score > 0)
				ret = "Player 1";
			else if (score < 0)
				ret = "Player 2";
			else
				ret = "TIE";
			System.out.println(ret);
		}

		scan.close();
	}
}