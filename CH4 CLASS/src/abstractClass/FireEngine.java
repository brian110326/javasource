package abstractClass;

public class FireEngine extends Car {

  public void water() {
    System.out.println("Water~");
  }

  @Override
  public void drive() {
    System.out.println("FireCar driving");
  }
}
