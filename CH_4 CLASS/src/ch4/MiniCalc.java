package ch4;

public class MiniCalc {

  public int plus(int x, int y) {
    return x + y;
  }

  public double avg(int x, int y) {
    int sum = plus(x, y);
    return sum / 2.0;
  }

  public void execute() {
    println("실행결과 : " + avg(7, 10));
  }

  public void println(String message) {
    System.out.println(message);
  }
}
