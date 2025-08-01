final class Constants {
    final int value  = 100;
    final void showValue() {
        System.out.println("Value: " + value);
    }
}

class A{
  final void display() {
    System.out.println("Display method in class A");
  }
}

class B extends A {}

public class FinalKeyword {
  public static void main(String[] args) {
    Constants constants = new Constants();
    constants.showValue();

    A a = new A();
    a.display();

    B b = new B();
    b.display();
  }
}
