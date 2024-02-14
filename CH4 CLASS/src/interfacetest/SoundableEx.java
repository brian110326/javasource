package interfacetest;

// public class Bonus extends CreditLine implements Account, CheckingAccount
public class SoundableEx {

  public static void main(String[] args) {
    Cat cat = new Cat();
    printSound(cat);
    //printSound(new Cat());

    printSound(new Dog());
  }

  public static void printSound(Soundable s) {
    System.out.println(s.sound());
  }
}
