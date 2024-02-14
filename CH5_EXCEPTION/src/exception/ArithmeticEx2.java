package exception;

// Object

// Throwable

// Exception

// RuntimeException, IOException

public class ArithmeticEx2 {

  public static void main(String[] args) {
    try {
      System.out.println(args[0]); //ArrayIndexOutOfBoundsException
      System.out.println(3 / 0); //ArithmeticException
    } catch (Exception e) {
      e.printStackTrace();
    }
    // } catch (ArrayIndexOutOfBoundsException e) {
    //   e.printStackTrace();
    // } catch (ArithmeticException e) {
    //   e.printStackTrace();
    // }
    // } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
    //   e.printStackTrace();
    // }
  }
}
