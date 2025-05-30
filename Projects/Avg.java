package Projects;

import java.util.Scanner;

public class Avg {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float a = scanner.nextLong();
    float b = scanner.nextLong();
    float c = scanner.nextLong();

    float avg = (a+b+c)/3;
    System.out.println(avg);
  }
}
