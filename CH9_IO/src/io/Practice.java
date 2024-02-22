package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {

  public static void main(String[] args) {
    Person person1 = new Person("홍길동", "Engineer", "010-1234-5678");
    Person person2 = new Person("김유신", "Teacher", "010-2323-5656");

    try (
      FileOutputStream fo = new FileOutputStream("c:\\temp\\serial.dat");
      ObjectOutputStream oos = new ObjectOutputStream(fo);
      FileInputStream fi = new FileInputStream("c:\\\\temp\\\\serial.dat");
      ObjectInputStream ois = new ObjectInputStream(fi);
    ) {
      oos.writeObject(person1);
      oos.writeObject(person2);

      for (int i = 0; i < 2; i++) {
        Person p = (Person) ois.readObject();
        System.out.println(p);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
