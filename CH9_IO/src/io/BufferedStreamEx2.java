package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedStreamEx2 {

  public static void main(String[] args) {
    // InputStream 사용시
    try (FileInputStream fis = new FileInputStream("c:\\temp\\kbs_1.mp4");) {
      long start = System.currentTimeMillis();
      while (fis.read() != -1) {}
      long end = System.currentTimeMillis();

      System.out.println("FileInputStream만 사용시 : " + (end - start));
    } catch (Exception e) {
      e.printStackTrace();
    }

    // BufferedInputStream 사용시
    try (
      FileInputStream fis = new FileInputStream("c:\\temp\\kbs_1.mp4");
      BufferedInputStream bis = new BufferedInputStream(fis)
    ) {
      byte data[] = new byte[4096];
      long start = System.currentTimeMillis();
      while (bis.read(data) != -1) {}
      long end = System.currentTimeMillis();

      System.out.println(
        "FinleInputStream + byte배열 + BufferedInputStream 사용시 : " +
        (end - start)
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
