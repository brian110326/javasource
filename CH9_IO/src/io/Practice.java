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

  public static void main(String[] args) throws IOException {
    try (
      FileReader fr = new FileReader("c:\\temp\\test1.txt");
      BufferedReader br = new BufferedReader(fr);
      FileWriter fw = new FileWriter("c:\\temp\\BBBBB.txt");
      BufferedWriter bw = new BufferedWriter(fw);
    ) {
      String str = null;

      while ((str = br.readLine()) != null) {
        bw.write(str);
        bw.newLine();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
