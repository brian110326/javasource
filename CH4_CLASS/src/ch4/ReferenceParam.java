package ch4;

public class ReferenceParam {

  public static void main(String[] args) {
    int[] x = { 10 };
    System.out.println("main () : x[0] = " + x[0]);
    change(x);
    System.out.println("main () : x[0] = " + x[0]);
  }

  // 원본수정 가능(주소값 참조)
  public static void change(int[] x) {
    x[0] = 1000;
    System.out.println("change () : x = " + x[0]);
  }
}
