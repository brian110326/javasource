package lambda;

// 함수형 인터페이스
// 람다식을 포함가능(추상메소드는 오직 하나만 사용)
// 람다식 ==> 익명 클래스 객체

@FunctionalInterface //필수는 아니지만 넣어주면 추상메소드가 더 들어오는것을 막을 수 있다
public interface MyFunction1 {
  void method(); // 추상메소드 : public abstract가 기본으로 있음
  //void print();
}
