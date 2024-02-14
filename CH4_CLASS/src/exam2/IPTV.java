package exam2;

public class IPTV extends ColorTv {

  private String address;

  public IPTV(int size, int colorNum, String address) {
    super(size, colorNum);
    this.address = address;
  }

  @Override
  public void printProperty() {
    System.out.printf(
      "나의 IPTV는 %s 주소의 %d인치 %d 컬러\n",
      address,
      getSize(),
      getColorNum()
    );
  }
}
