package ch4;

public class Calc {

  // 오버로딩 형태
  // 직사각형 넓이, 정사각형 넓이

  public double areaRectangle(double width) {
    // 정사각형 넓이
    double area = width * width;
    return area;
  }

  public double areaRectangle(double width, double height) {
    // 직사각형 넓이
    double area = width * height;
    return area;
  }
}
