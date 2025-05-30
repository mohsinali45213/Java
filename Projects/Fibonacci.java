package Projects;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a=1;
    int b=0;
    for (int i = 1; i <=n; i++) {
      int next = a+b;
      System.out.print(next+" ");
      a=b;
      b=next;
    }
  }
}
