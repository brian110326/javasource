package exception;

// Exception(예외)
// 1. 컴파일 예외(CheckedException) : 컴파일 시 발생하는 예외(컴파일러가 바로 알려줌)
// 2. 런타임 예외 : 실행 시 발생하는 예외(ArrayIndexOutOfBoundsException, ClassCastException, NullPointerException...)
// 3. 논리적 예외 : 실행은 정상적이지만 의도와는 다르게 동작

// 예외 핸들링
// 1) try~catch 구문 사용
// 2) throws : 예외를 메소드에 선언하는 방법 => 해당 메소드를 호출하는 측에 exception이 전달됨

public class CheckedException {

  public static void main(String[] args) throws ClassNotFoundException {
    // try {
    //   // Exception이 발생할 수 있는 부분을 넣어줌
    //   // Clas.forName ==> Class 이름 검색
    //   Class.forName("java.lang.String2");
    // } catch (ClassNotFoundException e) {
    //   // Exception 처리
    //   //e.printStackTrace();
    //   //System.out.println(e.getMessage());
    //   System.out.println("해당하는 클래스는 존재하지 않습니다");
    // }

    Class.forName("java.lang.String2");
  }

  public static void method1() {}

  public static void method2() {}
}
