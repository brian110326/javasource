package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOEx {

  public static void main(String[] args) {
    // 사용자 입력받기 ==> q 문자열이 입력되면 종료
    // 입력받은 문자를 파일에 쓰기

    String str;

    try (
      Scanner sc = new Scanner(System.in);
      FileWriter fw = new FileWriter("c:\\temp\\brian.txt");
      BufferedWriter bw = new BufferedWriter(fw);
    ) {
      do {
        System.out.println("문자열 입력 : ");
        str = sc.nextLine();

        if (!str.equalsIgnoreCase("q")) {
          bw.write(str);
          bw.newLine();
        }
      } while (!str.equals("q"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
