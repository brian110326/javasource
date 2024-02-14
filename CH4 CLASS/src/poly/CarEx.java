package poly;

public class CarEx {

  public static void main(String[] args) {
    Car car = null;

    FireEngine f1 = new FireEngine();
    FireEngine f2 = null;

    Ambulance a = null;
    //a = f1; ==> 상속관계가 아닌 클래스는 형변환 불가능

    f1.water();
    // 자동 형변환
    car = f1; // Car car = new FireEngine();

    // cast : 강제형변환
    f2 = (FireEngine) car;
    f2.water();

    Car car2 = new Car();
    // ClassException : 실행 시 에러 발생
    // FireEngine f3 = (FireEngine) car2;
    // f3.water();
  }
}
