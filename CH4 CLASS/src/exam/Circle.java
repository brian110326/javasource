package exam;

// 선언된 생성자가 1개도 없다면
// 컴파일러는 default 생성자를 자동으로 생성해줌

public class Circle {

  private final double PI = 3.14;
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    double area = radius * radius * PI;
    return area;
  }
}
