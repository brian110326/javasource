package lang;

// java.lang.String : 문자열 클래스
// 변경이 불가능한 클래스 : Immutable ==> only readable
//
public class StringEx1 {

  public static void main(String[] args) {
    String str = new String("abc");
    String str2 = "abc";
    String str3 = "abc";

    System.out.println(str2 == str3 ? "같음" : "다름"); //같음
    System.out.println(str2 == str ? "같음" : "다름"); //다름

    // String 클래스에 equals() 오버라이딩을 이미 해놓은 상태 ==> 값 비교
    System.out.println("equals() 결과");
    System.out.println(str2.equals(str3) ? "같음" : "다름"); //같음
    System.out.println(str2.equals(str) ? "같음" : "다름"); //같음

    String a = "a";
    String b = "b";
    a = a + b; // 문자열 결합횟수가 많다면 효율성 감소 ==> StringBuffer, StringBuilder 클래스 사용
  }
}
