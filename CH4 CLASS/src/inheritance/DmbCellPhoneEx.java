package inheritance;

public class DmbCellPhoneEx {

  public static void main(String[] args) {
    DmbCellPhone dcp = new DmbCellPhone();

    dcp.model = "iphone";
    dcp.color = "silver";
    dcp.channel = 7;

    dcp.powerOn();
    dcp.turnOnDmb();
    dcp.chagneChannelDmb(9);
    dcp.turnOffDmb();
    dcp.bell();
    dcp.sendVoice("Hello");
    dcp.receiveVoice("Hey");
    dcp.hangUp();
  }
}
