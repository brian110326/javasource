package inheritance;

public class CaptionTvEx {

  public static void main(String[] args) {
    CaptionTv cTv = new CaptionTv(true, 8, true);

    cTv.channelUp();
    System.out.println("현재 채널 : " + cTv.getChannel());

    cTv.displayCaption("Hello");
    cTv.caption = true;
    cTv.displayCaption("Hello");
  }
}
