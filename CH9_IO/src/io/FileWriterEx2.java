package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileWriterEx2 {

  public static void main(String[] args) {
    // 현재 폴더에서 자바소스를 읽은 후 다른 파일에 출력
    // FileEx1.java 읽기
    // E:\source\javasource\CH9_IO\src\io\FileEx1.java ==> .\src\io\FileEx1.java
    // c:\\temp\\output2.txt로 쓰기
    try (
      FileReader fr = new FileReader(
        ".\\src\\io\\FileEx1.java",
        Charset.forName("utf-8")
      );
      FileWriter fw = new FileWriter("c:\\temp\\output2.txt")
    ) {
      int data = 0;
      char[] c = new char[2048];
      while ((data = fr.read(c)) != -1) {
        fw.write(c);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
