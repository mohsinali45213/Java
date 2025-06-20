class Shape {
  double area;

  void displayArea() {
    System.out.println("Area: " + area);
  }
}

class Rectangle extends Shape {
  Rectangle(double length, double width) {
    this.area = length * width;
  }
}

class Polygon extends Shape {
}

class Triangle extends Polygon {
  Triangle(double base, double height) {
    this.area = 0.5 * base * height;
  }
}

class Circle extends Shape {
  Circle(double radius) {
    this.area = Math.PI * radius * radius;
  }
}

public class ComputeArea {
  public static void main(String[] args) {
    Shape rectangle = new Rectangle(5, 10);
    Shape triangle = new Triangle(5, 10);
    Shape circle = new Circle(5);

    rectangle.displayArea();
    triangle.displayArea();
    circle.displayArea();
  }
}
