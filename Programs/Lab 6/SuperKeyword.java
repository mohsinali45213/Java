class Parent {
  int x = 10;
  Parent() {
    System.out.println("Parent class constructor called");
  }
  void display() {
    System.out.println("Parent class display method");
  }
}

class Child extends Parent {
  int x = 20;

  Child() {
    super();
    System.out.println("Child class constructor called");
  }
  void display() {
    System.out.println("Child class display method");
  }

  void show() {
    System.out.println("Value of x in Child: " + x);
    System.out.println("Value of x in Parent: " + super.x);
    super.display();
  }
}

public class SuperKeyword {
  public static void main(String[] args) {
    Child child = new Child();
    child.show();
    child.display();
  }
}
