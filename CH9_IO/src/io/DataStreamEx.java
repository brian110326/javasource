package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream / DataOutputStream
// byte단위가 아닌 기본자료형 단위로 읽고 쓸 수 있다
// 기본자료형 값을 16진수로 표현하여 저장

public class DataStreamEx {

  public static void main(String[] args) {
    try (
      FileOutputStream fos = new FileOutputStream("c:\\temp\\primitive.dat");
      DataOutputStream dos = new DataOutputStream(fos);
      FileInputStream fis = new FileInputStream("c:\\temp\\primitive.dat");
      DataInputStream dis = new DataInputStream(fis);
    ) {
      dos.writeUTF("홍길동");
      dos.writeDouble(98.8);
      dos.writeInt(2);

      dos.writeUTF("이수현");
      dos.writeDouble(93.6);
      dos.writeInt(5);

      // 읽기
      for (int i = 0; i < 2; i++) {
        String name = dis.readUTF();
        double score = dis.readDouble();
        int num = dis.readInt();
        System.out.println(num + " : " + name + "(" + score + ")");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
