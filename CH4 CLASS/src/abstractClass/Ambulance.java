package abstractClass;

public class Ambulance extends Car {

  public void siren() {
    System.out.println("Siren~");
  }

  @Override
  public void drive() {
    System.out.println("Ambulance driving");
  }
}
