package interfacetest;

public class Television implements RemoteControl {

  private int volume;

  @Override
  public void turnOn() {
    System.out.println("Power On");
  }

  @Override
  public void turnOff() {
    System.out.println("Power Off");
  }

  @Override
  public void setVolume(int volume) {
    if (volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    } else if (volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
    } else {
      this.volume = volume;
    }

    System.out.println("현재 Tv 볼륨 : " + this.volume);
  }
}
