package ch4;

public class Car {

  // 메소드 => 기능, 멤버 변수 값 변경
  String company;
  String model;
  int maxSpeed;

  Car(String company, String model, int maxSpeed) {
    this.company = company;
    this.model = model;
    this.maxSpeed = maxSpeed;
  }

  public void forward() {
    System.out.println("전진");
  }

  public void backward() {
    System.out.println("후진");
  }
}
