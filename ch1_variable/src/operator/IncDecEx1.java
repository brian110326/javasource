package operator;

public class IncDecEx1 {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    System.out.printf("x = %d", (x++)); // x = x + 1
    System.out.println();
    System.out.printf("y = %d", (y++));
    System.out.println();

    System.out.println("x = " + x);
    System.out.println("y = " + y);

    System.out.printf("x = %d", (++x));
    System.out.println();
    System.out.printf("y = %d", (++y));
    System.out.println();
  }
}
