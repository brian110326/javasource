package exception;

// Exception(예외)
// 1. 컴파일 예외(CheckedException) : 컴파일 시 발생하는 예외(컴파일러가 바로 알려줌)
// 2. 런타임 예외

public class CheckedException {

  public static void main(String[] args) {
    try {
      Class.forName("null");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
