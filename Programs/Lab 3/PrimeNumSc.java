import java.util.Scanner;

public class PrimeNumSc {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		Boolean isPrime = n > 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println(n + " is not prime");
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(n + " is prime");
		}
	}
}