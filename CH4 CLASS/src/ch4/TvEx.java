package ch4;

// ===멤버변수 초기값===
// String : null로 초기화
// int : 0으로 초기화
// double , float : 0.0으로 초기화
// boolean : false

public class TvEx {

  public static void main(String[] args) {
    Tv tv1 = new Tv("black", 3, true);
    tv1.channelUp();
    tv1.channelUp();
    tv1.channelDown();
    System.out.println("현재 채널 : " + tv1.getChannel());

    // 채널번호 직접 입력
    tv1.channel_Select();
    System.out.println("현재 채널 : " + tv1.getChannel());

    tv1.setPower(false);
  }
}
