class Calculate{
  int num1, num2;
  Calculate(){
    num1 = 0;
    num2 = 0;
  }
  Calculate(int a){
    num1 = a;
    num2 = 0;
  }
  Calculate(int a, int b){
    num1 = a;
    num2 = b;
  }
  int add(){
    return num1 + num2;
  }
  int add(int a){
    return num1 + a;
  }
  int add(int a, int b){
    return a + b;
  }
  int multiply(){
    return num1 * num2;
  }
  int multiply(int a){
    return num1 * a;
  }
}

public class Method_Constructor_Overloading {
  public static void main(String[] args) {
    Calculate calc1 = new Calculate();
    System.out.println("Addition with no parameters: " + calc1.add());
    System.out.println("Multiplication with no parameters: " + calc1.multiply());

    Calculate calc2 = new Calculate(5);
    System.out.println("Addition with one parameter: " + calc2.add(10));
    System.out.println("Multiplication with one parameter: " + calc2.multiply(3));

    Calculate calc3 = new Calculate(5, 10);
    System.out.println("Addition with two parameters: " + calc3.add(15, 20));
    System.out.println("Multiplication with two parameters: " + calc3.multiply());
  }
}
