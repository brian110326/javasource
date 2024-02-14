package exam2;

public class ColorTv extends Tv {

  private int colorNum;

  public ColorTv(int size, int colorNum) {
    super(size);
    this.colorNum = colorNum;
  }

  public void printProperty() {
    System.out.printf("%d인치 %d컬러\n", getSize(), colorNum);
  }

  public int getColorNum() {
    return colorNum;
  }
}
