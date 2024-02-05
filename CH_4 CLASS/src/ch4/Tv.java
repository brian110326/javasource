package ch4;

// 클래스 : 설계도
// 객체 : 설계도를 통해 생산된 실제 존재

import java.util.Scanner;

public class Tv {

  String color;
  int channel;
  boolean power;
  int size;
  Scanner sc = new Scanner(System.in);

  public Tv(String color, int channel, boolean power, int size) {
    this.color = color;
    this.channel = channel;
    this.power = power;
    this.size = size;
  }

  public void channelUp() {
    channel++;
  }

  public void channelDown() {
    channel--;
  }

  public int channel_Select() {
    System.out.println("채널 입력 : ");
    channel = sc.nextInt();
    return channel;
  }
}
