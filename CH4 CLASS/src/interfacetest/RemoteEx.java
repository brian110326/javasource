package interfacetest;

public class RemoteEx {

  public static void main(String[] args) {
    Television tv = new Television();
    tv.turnOn();
    tv.setVolume(3);
    tv.turnOff();

    Audio audio = new Audio();
    audio.turnOn();
    audio.setVolume(15);
    audio.turnOff();

    exec(new Television());
    exec(new Audio());
  }

  public static void exec(RemoteControl r) {
    r.turnOn();
    r.setVolume(15);
    r.turnOff();
  }
}
