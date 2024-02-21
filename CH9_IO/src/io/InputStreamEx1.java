package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// java.io.* : io(input / output)
// 기본 input : keyboard
// 기본 output : 화면

// 스트림 : 입출력을 수행할 때 어느 한쪽에서 다른 쪽으로 데이터 전달시 두 대상을 연결하는 통로
// 단방향만 가능(입력, 출력 ==> 2개의 스트림이 필요)

// 1. Byte 기반 스트림(문자, 이미지, 동영상....)
// InputStream(추상 클래스) : Byte 기반이며 입력 스트림의 부모
// OutputStream(추상 클래스) : Byte 기반이며 출력 스트림의 부모

// 2. 문자 기반 스트림(문자)
// Reader(추상 클래스)
// Writer(추상 클래스)

public class InputStreamEx1 {

  public static void main(String[] args) {
    // 연결
    InputStream in = System.in;
    // in.read() : 1byte씩 읽어옴 ==> int로 return
    // in.read(byte[] b) : byte 배열로 읽어와서 읽어온 byte를 ==> int로 return
    // in.read(byte[] b, 0 , 100) : 입력 스트림에서 100byte 읽어와서 0번위치부터 저장
    //byte 배열로 읽어와서 특정 위치에 해당하는 데이터만 ==> int로 return

    OutputStream out = System.out;
    // out.write(byte[] b);
    // out.write(int);
    // out.write(byte[] b,0,0);

    // try {
    // 한바이트 입력 시
    //   int input = in.read();
    //   System.out.println((char) input);
    //   // abcd ==> a만 읽으니 97이 반환됨
    //   // 한글은 3byte이므로 1byte씩 읽어올수가 없음
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }

    // try {
    //   // 여러바이트 입력 시
    //   //   int input = in.read();
    //   //   System.out.println((char) input);
    //   int input = 0;
    //   while ((input = in.read()) != -1) {
    //     System.out.println((char) input);
    //   }
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }

    // try {
    //     byte b[] = new byte[100];
    //     in.read(b);
    //     System.out.println(Arrays.toString(b));
    //   } catch (IOException e) {
    //     e.printStackTrace();
    //   }

    // try {
    //   int input = in.read();
    //   out.write(input);
    //   in.close();
    //   out.close();
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }

    // try {
    //   int input = 0;
    //   while ((input = in.read()) != -1) {
    //     out.write(input);
    //   }
    //   in.close();
    //   out.close();
    // } catch (IOException e) {
    //   e.printStackTrace();
    // }

    try {
      byte[] b = new byte[100];
      in.read(b);
      out.write(b);

      in.close();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
