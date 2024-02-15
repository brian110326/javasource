package lang;

// java.lang.StringBuffer : mutable (변경 가능한 클래스), thread-safe
// java.lang.StringBuilder : mutable (변경 가능한 클래스)
public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");

    // String으로 변환해서 equals 사용
    String str1 = new String(sb1);
    String str2 = new String(sb2);

    String s1 = sb1.toString();
    String s2 = sb2.toString();
    // equals, toString

    System.out.println(sb1.equals(sb2) ? "같음" : "다름");
    System.out.println(sb1);
  }
}
