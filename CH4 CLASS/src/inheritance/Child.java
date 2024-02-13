package inheritance;

// 패키지 : 클래스 묶음
//         모든 클래스는 반드시 하나의 패키지에 속해있다
//         .을 구분자로 하여 계층 구조로 구성

// 상속 : 기존의 클래스를 재사용하여 새로운 클래스 작성
//       적은 양의 코드로 새로운 클래스를 작성할 수 있고 코드를 공통적으로 관리하기 때문에
//       추가 및 변경이 용이
//       자식 클래스는 부모클래스의 모든 멤버를 상속
//       생성자와 초기화 블럭은 상속되지 X
//       오버라이딩 : 부모의 메소드와 동일한 시그니처(return 타입, 메소드명, 인자)를 가진다
//                   오버라이딩 메소드는 부모보다 접근 제한자를 좁게 가져서는 안됨
//                   새로운 예외를 throws 할 수 없음
//                   부모 메소드 재정의
//                   단일 상속만 가능
//                   모든 클래스는 Object 클래스를 상속한다

// Parent : 부모 클래스, 상위(super) 클래스, base 클래스
// Child : 자식 클래스, 하위(sub) 클래스, 파생 클래스

public class Child extends Parent {

  private String name = "Brian";

  public Child(int age) {
    // 부모의 생성자 호출
    super(age);
  }

  public void play() {
    System.out.println("Play");
  }

  @Override
  public void print() {
    super.print(); //가려진 부모의 메소드 호출
    System.out.println("My name is " + name);
  }
}
