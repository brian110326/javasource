package ch4;

public class NumbersEx {

  public static void main(String[] args) {
    int[] num = { 10, 15, 20, 25, 30, 35, 40 };
    Numbers number = new Numbers(num);
    System.out.println("합계 : " + number.getTotal());
    System.out.println("평균 : " + number.getAverage());
  }
}
