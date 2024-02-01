package operator;

// && : 피연산자 양쪽 모두 true이어야 true결과를 얻음
// || : 피연산자 중 한쪽이라도 true면 true결과를 얻음
public class LogicalEx1 {

  public static void main(String[] args) {
    // x는 10보다 크고 20보다 작다
    int x = 15;
    System.out.println(x > 10 && x < 20);

    int charCode = 'A';
    if ((charCode >= 65) && (charCode <= 90)) {
      System.out.println("대문자");
    }

    char charCode2 = 'a';
    System.out.println(charCode2 >= 'a' && charCode2 <= 'z');
    if ((charCode2 >= 'a') && (charCode2 <= 'z')) {
      System.out.println("소문자");
    }

    // i는 2의 배수 또는 3의 배수이다
    int i = 6;
    // i % 2 == 0 || i % 3 == 0
    if (i % 2 == 0 || i % 3 == 0) {
      System.out.println("i는 2의 배수 또는 3의 배수");
    }

    // i는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다
    System.out.println((i % 6 != 0) && ((i % 2 == 0) || (i % 3 == 0)));
  }
}
