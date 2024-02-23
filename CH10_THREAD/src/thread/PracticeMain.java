package thread;

public class PracticeMain {

  public static void main(String[] args) {
    Runnable run = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i <= 10; i++) {
          System.out.println(i);
        }
      }
    };
    Thread t3 = new Thread(run);
    t3.start();

    Thread t = new Thread(new Practice1());
    t.start();

    Thread t2 = new SmallLetters2();
    t2.start();

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
