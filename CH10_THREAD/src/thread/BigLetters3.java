package thread;

public class BigLetters3 {

  public static void main(String[] args) {
    // 익명구현 : 일회성
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 1; i <= 100; i++) {
          System.out.print(i + " ");
        }
      }
    };
    Thread t = new Thread(r);
    t.start(); //thread 실행

    Thread t2 = new SmallLetters2();
    t2.start();

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
