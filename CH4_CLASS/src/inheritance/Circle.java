package inheritance;

// Point의 x, y를 이용하고 싶을때

// 1. 클래스 상속
// public class Circle extends Point {

//   //   int x;
//   //   int y;
//   int radius;
// }

// 2. 객체 생성 ==> 포함관계 : 한 클래스의 멤버변수로 다른 클래스의 타입의 참조 변수를 선언
public class Circle {

  // p라는 멤버변수에 new Point를 대입
  Point p = new Point();
  int r;
}
// 상속관계(ISA 관계)
// 포함관계(HASA 관계)
