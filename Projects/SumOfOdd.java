package Projects;

import java.util.Scanner;

public class SumOfOdd {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(sum(n));
  }

  public static int sum(int n){
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if(i % 2 != 0){
        sum+=i;
      }
    }
    return sum;
  }
}
