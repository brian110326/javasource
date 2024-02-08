package inheritance;

public class Tv {

  private boolean power;
  private int channel;

  public Tv() {}

  public Tv(boolean power, int channel) {
    this.power = power;
    this.channel = channel;
  }

  public void power() {
    power = !power;
  }

  public void channelUp() {
    channel++;
  }

  public void channelDown() {
    channel--;
  }

  public boolean isPower() {
    return power;
  }

  public int getChannel() {
    return channel;
  }
}
