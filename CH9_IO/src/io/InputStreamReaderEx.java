package io;

import java.io.FileInputStream;
import java.io.InputStreamReader;

// 보조 스트림 : 기존 스트림의 기능 보완
// 데이터 입출력 기능 X (중간에 껴있는 것들)

// 1) Byte 기반
// BufferedInputStream / BufferedOutputStream : 버퍼를 이용한 입출력 향상 스트림
// DataInputStream / DataOutputStream : 기본형 단위로 데이터를 처리
// PrintStream : 버퍼를 사용하며 , print, println, printf가 정의가 되어있음

// 2) 문자 기반
// BufferedReader / BufferedWriter : 버퍼를 이용한 입출력 향상 스트림

// Bridge Stream
// InputStreamReader / OutputStreamReader
// InputStreamReader : byte스트림 ==> 문자기반으로 바꿔줌
// OutputStreamReader : 문자스트림 ==> byte로 바꿔줌

public class InputStreamReaderEx {

  public static void main(String[] args) {
    try (
      FileInputStream fis = new FileInputStream("c:\\temp\\test1.txt");
      InputStreamReader ir = new InputStreamReader(fis)
    ) {
      int data = 0;
      // byte[] b = new byte[1024];

      // byte 기반
      //   while ((data = fis.read()) != -1) {
      //     System.out.println((char) data);
      //   }
      char[] cbuf = new char[1024];
      while ((data = ir.read(cbuf)) != -1) {
        System.out.println(cbuf);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
