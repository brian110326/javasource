package lang;

public class StringEx3 {

  public static void main(String[] args) {
    String str1 = "Hello! Java";

    // 문자열 ==> char 배열로 변경하기
    // length() ==> 길이 리턴
    System.out.println(str1.length());
    System.out.println();

    char ch[] = new char[str1.length()];

    for (int i = 0; i < str1.length(); i++) {
      ch[i] = str1.charAt(i);
    }
    System.out.println(ch);

    String str2 = "자바 프로그래밍";
    // '프' 문자가 존재한다면 들어있음 출력 , 없으면 없음 출력
    if (str2.contains("프")) {
      System.out.println("프 포함");
    } else {
      System.out.println("프 없음");
    }
  }
}
