package inheritance;

public class CellPhone {

  String model;
  String color;

  public void powerOn() {
    System.out.println("Power on");
  }

  public void powerOff() {
    System.out.println("Power off");
  }

  public void bell() {
    System.out.println("Bell ringing");
  }

  public void sendVoice(String msg) {
    System.out.println("본인메세지 : " + msg);
  }

  public void receiveVoice(String msg) {
    System.out.println("상대메세지 : " + msg);
  }

  public void hangUp() {
    System.out.println("Hang up");
  }
}
