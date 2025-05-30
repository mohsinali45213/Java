import java.util.Scanner;

public class _1stLastOccurrence {

  public static int first = -1;
  public static int last = -1;

  public static void occurrence(String str, int idx, char alpha) {
    if (idx == str.length()) {
      System.out.println(first);
      System.out.println(last);
      return;
    }
    char current = str.charAt(idx);
    if (current == alpha) {
      if (first == -1) {
        first = idx;
      } else {
        last = idx;
      }
    }
    occurrence(str, idx + 1, alpha);
  }

  public static void main(String[] args) {
    String str = "abhioaafaaroaaporkak";
    Scanner scanner = new Scanner(System.in);
    char alpha = scanner.next().charAt(0);
    occurrence(str, 0, alpha);
    scanner.close();
  }
}
