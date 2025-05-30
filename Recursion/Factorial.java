public class Factorial {
  public static int fact(int n){
    if (n==1) {
      return 1;
    }
    int factNum = fact(n-1);
    int total = n*factNum;
    return total;
  }
  public static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    // Recursive case: n * factorial of (n-1)
    return n * factorial(n - 1);
}
  public static void main(String[] args) {
    int n = 5;
    System.out.println(fact(n));
    int m = 5;
    System.out.println(factorial(m));
  }
}