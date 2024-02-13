package inheritance;

public class DmbCellPhone extends CellPhone {

  int channel;

  public void turnOnDmb() {
    System.out.println("channel " + channel + " broadcasting");
  }

  public void chagneChannelDmb(int channel) {
    this.channel = channel;
    System.out.println("channel => " + channel);
  }

  public void turnOffDmb() {
    System.out.println("channel " + channel + " Dmb off");
  }
}
