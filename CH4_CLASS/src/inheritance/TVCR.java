package inheritance;

// TV + VCR

// 관계 ==> 1. 상속   2. 포함

public class TVCR extends Tv {

  VCR vcr = new VCR();
  int counter = vcr.counter;

  public void play() {
    vcr.play();
  }

  public void stop() {
    vcr.stop();
  }
}
