interface BasicOp {
  int add(int a, int b);
}

interface AdvOP {
  int multiply(int a, int b);
}

interface AO extends BasicOp, AdvOP {
}

public class Calculator implements AO {
  public int add(int a, int b) {
    return a + b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println("Addition : " + calc.add(5, 3));
    System.out.println("Multiply : " + calc.multiply(5, 3));
  }
}