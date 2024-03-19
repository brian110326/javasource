package lang;

import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Practice {

  public static void main(String[] args) {
    System.out.println(count("2147824hhhihihss", "h"));
    System.out.println(count("12345", "AB"));
  }

  public static int count(String src, String target) {
    // src에 target 문자가 몇번 나오는지 세어서 반환
    int count = 0;
    int pos = 0;

    while (true) {
      pos = src.indexOf(target, pos);
      if (pos != -1) {
        count++;
        pos += target.length();
      }
    }
  }
}
