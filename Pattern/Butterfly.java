public class Butterfly {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 4; i>0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}