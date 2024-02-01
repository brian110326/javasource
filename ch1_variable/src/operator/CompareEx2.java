package operator;

public class CompareEx2 {

  public static void main(String[] args) {
    // 문자 vs 문자열
    // ' ' vs  " "
    // 'A'     "ABC"

    String str1 = "Hong";
    String str2 = "Hong";

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

    String str3 = new String("Hong");
    System.out.println(str1 == str3);
    System.out.println(str1.equals(str3));
  }
}
