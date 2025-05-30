package  Projects;

public class StringBuilders {

  public static void main(String[] args) {
    StringBuilder str = new StringBuilder("Apple");
    System.out.println(str);

    // Reverse string
    for (int i = 0; i < str.length() / 2; i++) {
      int front = i;
      int back = str.length() - 1 - i;

      char frontChar = str.charAt(front);
      char backChar = str.charAt(back);

      str.setCharAt(front, backChar);
      str.setCharAt(back, frontChar);
    }

    System.out.println(str);
  }
}