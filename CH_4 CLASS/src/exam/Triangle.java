package exam;

public class Triangle {

  // 밑변, 높이
  private int baseline;
  private int height;

  public Triangle(int baseline, int height) {
    this.baseline = baseline;
    this.height = height;
  }

  // 삼각형의 넓이
  public double getArea() {
    double area = (baseline * height) / 2.0;
    return area;
  }
}
