public class Main {
  public static void main(String[] args) {
    System.out.println("Solid Rectangle");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("Hollow Rectangle");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        if (i == 0 || i == 3 || j == 0 || j == 4) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    System.out.println("Low-High Triangle");
    for (int i = 0; i <= 4; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("High-Low Triangle");
    for (int i = 4; i >= 0; i--) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println("Invert Low-High Triangle");
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    

    System.out.println("Low-High Number Triangle");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }

    System.out.println("High-Low Number Triangle");
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }

    System.out.println("Low-High Number Triangle");
    int num = 1;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }

    System.out.println("Low-High Number Triangle");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        int sum = i + j;
        if (sum % 2 == 0) {
          System.out.print(1 + " ");
        } else {
          System.out.print(0 + " ");
        }
      }
      System.out.println();
    }
  }
}