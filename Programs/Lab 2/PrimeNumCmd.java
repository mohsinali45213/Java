public class PrimeNumCmd {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
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