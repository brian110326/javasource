package loop;

public class WhileEx2 {

  public static void main(String[] args) {
    // for (int i = 1; i < 10; i++) {
    //   System.out.printf("3 X %d = %d\n", i, 3 * i);
    // }

    int i = 1;
    while (i < 10) {
      System.out.printf("3 X %d = %d\n", i, 3 * i);
      i++;
    }
  }
}
