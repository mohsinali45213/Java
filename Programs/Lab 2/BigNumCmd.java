
public class BigNumCmd {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    if (x > y) {
      System.out.println("X is Bigger");
    } else {
      System.out.println("Y is Bigger");
    }
  }
}