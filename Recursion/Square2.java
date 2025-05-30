public class Square2 {

  public static int square(int x, int n) {
    if (n == 0) {
      return 1;
    }
    if (x == 0) {
      return 0;
    }
    if (n % 2 == 0) {
      return square(x, n / 2) * square(x, n / 2);
    } else {
      return square(x, n / 2) * square(x, n / 2) * x;

    }
  }

  public static void main(String[] args) {
    int n = 5, x = 2;
    int result = square(x,n);
    System.out.println(result);
  }
}
