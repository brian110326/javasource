package ch4;

public class TvEx2 {

  public static void main(String[] args) {
    // Tv 인스턴스 3개 생성
    // Tv tv1 = new Tv("Red", 3, false);
    // Tv tv2 = new Tv("Blue", 45, false);
    // Tv tv3 = new Tv("Black", 100, false);

    Tv tvarr[] = new Tv[3]; // int arr[] = new int[3];
    tvarr[0] = new Tv("Red", 3, false);
    tvarr[1] = new Tv("Blue", 45, false);
    tvarr[2] = new Tv("Black", 100, false);

    int arr[] = { 1, 2, 3 };

    Tv tvarr2[] = {
      new Tv("Red", 3, false),
      new Tv("Blue", 45, false),
      new Tv("Black", 100, false),
    };

    // 첫번째 tv전원 ON
    tvarr[0].setPower(true);
    tvarr[0].setChannel(15);

    tvarr[2].setPower(true);
    tvarr[2].setChannel(20);
  }
}
