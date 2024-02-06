package ch4;

// 클래스 : 설계도
// 객체 : 설계도를 통해 생산된 실제 존재

import java.util.Scanner;

public class Tv {

  private String color;
  private int channel;
  private boolean power;

  Scanner sc = new Scanner(System.in);

  // 생성자 오버로딩

  public Tv() {}

  public Tv(String color, int channel, boolean power) {
    this.color = color;
    this.channel = channel;
    this.power = power;
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

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public boolean isPower() {
    return power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }
}
