package lang;

public class StringBufferEx2 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    // StringBuffer sb2 = "Hello"; ==> 불가능

    // append() : 원분 문자열 뒤에 추가
    System.out.println(sb1.append(" World"));
    sb1.append("123").append("456").append("789");
    System.out.println(sb1); // 원본이 변경됨
    // String str1 = "Hello"; str1 += "123";.....

    // charAt()
    System.out.println(sb1.charAt(3));

    // delete() : 끝 위치 문자 제외
    sb1.delete(3, 6);
    System.out.println(sb1);

    // insert() :
    sb1.insert(4, " 012345");
    System.out.println(sb1);

    // length()

    // replace() : 끝위치를 제외하고 그전까지 바꿈
    sb1.replace(0, 3, "AB");
    System.out.println(sb1);

    String str2 = "0123456789";

    // 9876543210으로 출력하기
    for (int i = str2.length() - 1; i >= 0; i--) {
      System.out.println(str2.charAt(i));
    }

    for (int i = 1; i <= str2.length(); i++) {
      System.out.println(str2.charAt(str2.length() - i));
    }

    StringBuffer sb3 = new StringBuffer("0123456789");
    System.out.println(sb3.reverse());

    // String ==> StringBuffer
    // 메소드로는 존재X
    // 생성자로
    StringBuffer sb4 = new StringBuffer(str2);
    System.out.println(sb4.reverse());

    sb1.setCharAt(1, 'K');
    System.out.println(sb1);

    StringBuilder sBuilder1 = new StringBuilder("Hello");
  }
}
