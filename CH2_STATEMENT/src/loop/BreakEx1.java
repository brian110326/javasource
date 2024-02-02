package loop;

public class BreakEx1 {

  public static void main(String[] args) {
    // break; => switch문
    int sum = 0;
    int i = 0;
    while (true) {
      sum += i;
      if (sum > 100) {
        break;
      }
      i++;
    }
    System.out.printf("i = %d , sum = %d\n", i, sum);
  }
}
