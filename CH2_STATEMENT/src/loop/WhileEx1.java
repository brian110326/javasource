package loop;

public class WhileEx1 {

  public static void main(String[] args) {
    // for (int i = 0; i < 5; i++) {
    //   System.out.println("I can do it");
    // }

    int i = 0;
    while (i < 5) {
      System.out.println("I can do it");
      i++;
    }

    // for (int i = 1; i <= 10; i++) {
    //   sum += i;
    // }
    // System.out.println("합계 : " + sum);
    int j = 0;
    int sum = 0;
    while (j < 10) {
      sum += j;
      j++;
    }
    System.out.println("합계  : " + sum);
  }
}
