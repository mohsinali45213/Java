package calc;

public class Calc {
  public void getSum(int a, int b) {
    System.out.println("Sum: " + (a + b));
  }
  public void getDifference(int a, int b) {
    System.out.println("Difference: " + (a - b));
  }
  public void getProduct(int a, int b) {
    System.out.println("Product: " + (a * b));
  }
  public void getDivision(int a, int b) {
    if (b != 0) {
      System.out.println("Division: " + (a / b));
    } else {
      System.out.println("Division by zero error");
    }
  }
}
