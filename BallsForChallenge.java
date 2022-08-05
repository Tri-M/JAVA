import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			String X = sc.next();
			String Y = sc.next();
			
			System.out.println("The result is : ");
			System.out.println(minHamming(X, Y));
		}

		sc.close();
	}

	static String minHamming(String X, String Y) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < X.length(); i++) {
			if (X.charAt(i) == 'B' && Y.charAt(i) == 'B') {
				result.append('W');
			} else {
				result.append('B');
			}
		}
		return result.toString();
	}
}
