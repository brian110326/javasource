package io;

import java.io.FileWriter;

public class FileWriterEx1 {

  // \r\n (CRLF)
  // \r(CR : 캐리지 리턴)
  // \n(LF : 라인 피드)

  public static void main(String[] args) {
    try (FileWriter fw = new FileWriter("c:\\temp\\output1.txt", true)) {
      fw.write("FileWriter는 한글로 작성된\r\n");
      fw.write("문자열을 바로 출력할 수 있다\r\n");
      fw.write("Writer 클래스는 문자 단위의\r\n");
      fw.write("출력만 가능합니다\r\n");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
