package exam;

public class Equation {

  public static void main(String[] args) {
    // 4x + 5y = 60이 나오는 모든 해 구하기
    // x, y는 10이하의 자연수

    for (int x = 1; x <= 10; x++) {
      for (int y = 1; y <= 10; y++) {
        if (4 * x + 5 * y == 60) {
          System.out.printf("순서쌍 (x,y) => (%d,%d)\n", x, y);
        }
      }
    }
  }
}
