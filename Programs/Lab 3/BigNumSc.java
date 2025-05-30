import java.util.Scanner;

public class BigNumSc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter X");
    int x = sc.nextInt();
    System.out.println("Enter Y");
    int y = sc.nextInt();
    if (x > y) {
      System.out.println("X is Bigger");
    } else {
      System.out.println("Y is Bigger");
    }
  }
}