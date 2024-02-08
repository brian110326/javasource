package com.porject.book;

// java.lang 패키지는 기본으로 import가 이미 되어있음 ==> 따로 import구문을 X

// Math 클래스는 모든 요소가 static상태
import static java.lang.Math.*;

public class MathEx1 {

  public static void main(String[] args) {
    // Math 클래스
    System.out.println(PI);
    System.out.println(E);
    System.out.println(random());
    System.out.println(ceil(3.4));
  }
}
