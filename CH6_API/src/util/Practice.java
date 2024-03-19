package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Practice {

  public static void main(String[] args) {
    // 키보드로 문자열을 읽어서 분리하는 프로그램
    // 입력 ==> 아빠/엄마/수연/수희/수정 : /를 기준으로 잘라서 출력
    Scanner sc = new Scanner(System.in);
    System.out.println("입력 : ");
    String s = sc.nextLine();

    StringTokenizer st = new StringTokenizer(s, "/");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
