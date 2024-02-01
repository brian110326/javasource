package condition;

// Math.random() : 0.0 <= Math.random() < 1.0

public class ifEx6 {

  public static void main(String[] args) {
    int dice = (int) (Math.random() * 6) + 1;
    System.out.println(dice);
  }
}
