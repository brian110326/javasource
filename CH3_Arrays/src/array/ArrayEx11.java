package array;

// String은 char형태의 조합

import java.util.Arrays;

public class ArrayEx11 {

  public static void main(String[] args) {
    // String 배열
    String[] names = { "Lee", "Kim", "Park" };

    for (String str : names) {
      System.out.println(str);
    }

    for (int i = 0; i < names.length; i++) {
      String str1 = names[i];

      for (int j = 0; j < str1.length(); j++) {
        char ch = str1.charAt(j);
        System.out.printf("str.char(%d) : %c\n", j, ch);
      }
    }

    String src = "ABCDE";
    char[] chArr = src.toCharArray();
    System.out.println(chArr);
  }
}
