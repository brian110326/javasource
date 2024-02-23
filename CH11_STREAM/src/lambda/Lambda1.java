package lambda;

// Lambda Expression
// 메소드(함수)를 하나의 식으로 표현

// 메소드 : 반환타입 메소드명(매개변수){}
// 람다식 : (매개변수 선언) -> {}

public class Lambda1 {

  // 기본 메소드 선언 방식
  int max(int num1, int num2) {
    return num1 > num2 ? num1 : num2;
  }

  // lambda식
  // (int num1, int num2) -> { return num1 > num2 ? num1 : num2;}
  // (int num1, int num2) -> num1 > num2 ? num1 : num2;
  // (num1, num2) -> num1 > num2 ? num1 : num2;

  public void print(String name, int i) {
    System.out.println(name + " = " + i);
  }

  // (String name, int i) -> System.out.println(name + " = " + i);
  // (name, i) -> System.out.println(name + " = " + i);

  public int square(int x) {
    return x * x;
  }

  // (x) -> x * x;

  public int roll() {
    return (int) (Math.random() * 6);
  }

  // () -> (int) (Math.random() * 6);

  public int sumArr(int[] arr) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    return sum;
  }
  // (int[] arr) -> {
  //     int sum = 0;
  //     for (int i : arr) {
  //       sum += i;
  //     }
  //     return sum;
  //   }
  // 실행문이 많으면 중괄호 생략 불가
}
