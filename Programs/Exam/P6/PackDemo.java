import calc.Calc;
public class PackDemo {
  public static void main(String[] args) {
    Calc calculator = new Calc();
    calculator.getSum(5, 3);
    calculator.getDifference(5, 3);
    calculator.getProduct(5, 3);
    calculator.getDivision(5, 3);
  }
}
