import java.util.Scanner;

public class FactSc {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int fact = 1;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial : " + fact);
	}
}