package util;

import java.util.StringTokenizer;

public class StringTokenEx2 {

  public static void main(String[] args) {
    String str = "This is a test";

    // 기준이 없으면 공백 1개가 자동으로 기준이 됨
    StringTokenizer st = new StringTokenizer(str);

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    str = "x=100*(200+300)/2";
    StringTokenizer st2 = new StringTokenizer(str, "=*+/()", true);

    while (st2.hasMoreTokens()) {
      System.out.println(st2.nextToken());
    }

    str = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
    StringTokenizer st3 = new StringTokenizer(str, ",|");
    while (st3.hasMoreTokens()) {
      System.out.println(st3.nextToken());
    }

    System.out.println();

    st3 = new StringTokenizer(str, "|");
    while (st3.hasMoreTokens()) {
      String token = st3.nextToken(); //1,김천재,100,100,100
      StringTokenizer st4 = new StringTokenizer(token, ",");

      while (st4.hasMoreTokens()) {
        System.out.println(st4.nextToken());
      }
    }
  }
}
