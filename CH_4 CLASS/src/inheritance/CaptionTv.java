package inheritance;

public class CaptionTv extends Tv {

  boolean caption;

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel);
    this.caption = caption;
  }

  public void displayCaption(String text) {
    // if(caption != true) ==> if(!caption)
    if (caption) {
      System.out.println(text);
    }
  }
}
