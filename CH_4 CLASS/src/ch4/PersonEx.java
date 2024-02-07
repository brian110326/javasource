package ch4;

public class PersonEx {

  public static void main(String[] args) {
    // Person person = new Person();
    // person.setName("Brian");
    // System.out.println("이름 : " + person.getName());

    // Person person2 = new Person();
    // person2.setName("Emily");
    // System.out.println("이름 : " + person2.getName());

    // System.out.println(person.toString());

    Person person = new Person("Brian", "Korea");
    Person person2 = new Person("Brian", "Korea");
    person.setName("Lee");
    System.out.println(Person.getPi());

    System.out.println(person == person2);
  }
}
