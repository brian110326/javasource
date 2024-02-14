package poly;

// 다형성(Polymorphism)
// 부모클래스 타입의 참조변수로 자손 클래스의 인스턴스 참조
// 형변환 : 자손타입==> 부모타입(자동형변환), 부모타입==> 자손타입(강제 형변환)
// 형변환 ==> 참조변수의 타입을 변환하는 것으로 참조할 수 있는 범위를 조절하는 개념

public class ChildEx {

  public static void main(String[] args) {
    Child child = new Child();

    // 상속관계라면
    Parent child1 = new Child();
    // child1을 접근 가능한 범위 ==> field1, method1, method2

    child1.method2(); // 오버라이딩 된 메소드라면 자식 메소드가 실행
  }
}
