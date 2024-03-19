package thread;

public class PracticeMain {

  public static void main(String[] args) {
    Thread t = new SmallLetters2();
    t.start();

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
