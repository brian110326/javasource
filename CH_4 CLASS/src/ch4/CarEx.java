package ch4;

public class CarEx {

  public static void main(String[] args) {
    // 객체 생성 ==> 사용가능한 상태로 만듦
    Car car1 = new Car("Mercedes", "E-Class", 300);
    car1.forward();
    car1.backward();
  }
}
