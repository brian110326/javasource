package lang;

import java.util.Date;

public class StringEx2 {

  public static void main(String[] args) {
    String str1 = new String("Hello");
    char[] chars = { 'H', 'e', 'l', 'l', 'o' };
    String str2 = new String(chars);
    String str3 = "Hello";

    // charAt()
    // return 타입 존재 ==> 변수에 담기, 출력하기
    char ch = str1.charAt(0);
    // charAt() : index 위치 문자를 반환
    System.out.println("charAt(0) : " + ch);
    System.out.println("charAt(3) : " + str2.charAt(3));

    // 1. concat() : 문자열 뒤에 연결
    String s = str1.concat(str3.concat(str2));
    System.out.println(s);

    String ss = str1.concat("World");
    System.out.println(ss);

    // 2. compareTo()
    // 문자열을 사전 순서로 비교
    // 같으면 0, 사전순으로 이전이면 음수, 사전순으로 이후면 양수
    // a ==> 97, b ==> 98
    int a = str1.compareTo(str3);
    System.out.println(a);

    System.out.println("aaa".compareTo("bbb")); // 97 - 98
    System.out.println("bbb".compareTo("aaa")); // 98 - 97
    System.out.println("bbb".compareTo("baa"));
    // 첫번째 문자끼리 비교 ==> 같다면 그다음 문자 비교

    // 3. contains() : 특정 문자열이 포함되어있는지 검사
    System.out.println(str1.contains("e"));

    // 4. endsWith() : 지정된 문자열로 끝나는지 여부 검사
    System.out.println("Hello.txt".endsWith("txt"));

    // 5. startsWith() : 지정된 문자열로 시작하는지 여부 검사
    System.out.println(str3.startsWith("H"));

    // 6. equals() / equalsIgnoreCase() ==> 대소문자 구별 X
    // Hello / HELLO (문자 대소문자 구별 함)
    System.out.println(str1.equalsIgnoreCase("HELLO")); //true
    System.out.println(str1.equals("HELLO")); //false

    // 7. indexOf() : 주어진 문자가 문자열에 존재하는지 위치를 반환
    // 있으면 해당위치 반환, 없으면 -1 반환
    System.out.println(str1.indexOf("l", 3));
    System.out.println(str1.indexOf("s"));
    System.out.println(str1.indexOf("H"));

    // 8. lastIndexOf() : 지정된 문자를 문자열의 오른쪽 끝에서부터 검색
    String str4 = "java.lang.String";
    System.out.println(str4.lastIndexOf("."));
    System.out.println(str4.indexOf("."));

    // 9. length() : 문자열의 길이 반환
    System.out.println(str1.length());

    // 10. replace() : oldchar ==> newchar
    String replacedStr = str1.replace('H', 'h');
    System.out.println(replacedStr);

    str2 = str2.replace('H', 'h'); //다시 담아주기 ==> 변경가능
    System.out.println(str2); // Immutable : 원본이 바뀌지는 X

    str2 = str2.replace("ll", "LL");
    System.out.println(str2);

    str4 = "Hellollo";
    System.out.println("replace() " + str4.replace("ll", "LL"));
    System.out.println("replaceAll() " + str4.replaceAll("ll", "LL"));
    System.out.println("replaceFirst() " + str4.replaceFirst("ll", "LL"));

    // 11. split() : 문자열 분리한 후 분리기준에 따라 배열로 리턴
    String[] strArr = str1.split("");
    for (String string : strArr) {
      System.out.println(string);
    }

    str4 = "dog,cat,bear";
    // ,를 기준으로 자르지만 2개로만 자른다
    strArr = str4.split(",", 2);
    for (String string : strArr) {
      System.out.println(string);
    }
    // 12. substring() : 시작위치부터 끝위치에 포함된 문자열 추출(끝 위치는 포함 X)
    System.out.println(str1.substring(1, 4));

    // 13. toLowerCase() : 모든 문자를 소문자로 변환
    System.out.println(str1.toLowerCase());

    // 14. toUpperCase() : 모든 문자를 대문자로 변환
    System.out.println(str1.toUpperCase());

    // 15. toString()
    System.out.println(str1.toString());

    // 16. trim() : 앞뒤 공백을 제거(가운데 공백은 제거 X)
    str4 = "     Hello     World     ";
    System.out.println(str4.trim());

    // 17. valueOf() : 지정된 값을 문자열로 변환하여 반환
    int num = Integer.parseInt("100");
    String num1 = String.valueOf(100);
    num1 = String.valueOf(1.3f);
    num1 = String.valueOf(1000L);

    Date d = new Date();
    num1 = String.valueOf(d);
    System.out.println(num1);

    int i = 100;
    String type = String.valueOf(i); // ==> "100"
    type = i + ""; // 더 간단한 식

    // String.valueOf(10) <==> Integer.parseInt("10")
    // String.valueOf(10.3) <==> Double.parseDouble("10.3")
    // "10.3f" ==> 10.3f

    double d1 = Double.parseDouble("10.3d");
    float f1 = Float.parseFloat("10.3f");
    long l1 = Long.parseLong("10.3L");
  }
}
